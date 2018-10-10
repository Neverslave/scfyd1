var isEdit = CloudUtils.getIframeParams($(window.parent.document).find('iframe').attr('src')).isEdit; 
var canDzSubmit = false;
var canLsSubmit = false;
var roleId = store.get('roleId');
$(function() {
	if(isEdit!=null){
	}else{
		isEdit=true;
	}
	 CloudUtils.getMenuNames("nav");
//	 initDetailForm(store.get('corpId'));
//	 $("#corpId").val(store.get('corpId'));
//	 initShareHolderInfoTable(store.get('corpId'));
//	 initcontractInfoTable(store.get('corpId'));
//	 attachInfoTable(store.get('corpId'));
	 shareFormValidator();
	 ajaxFileUpload();
	 formValidator();
	 propertychange();
	 numFormat();
	 $('#shareInfoModal').on('hidden.bs.modal', function() {
			$("#shareInfoForm").bootstrapValidator('resetForm', true);
			$("#shareInfoForm")[0].reset();
		});
	 getFormInfo();
 });
 
 var shareIndex =0;
 var shareDetailRow = null;
 window.operateEvents = {
		'click .detail': function (e, value, row, index) {
			 detailFun(row);
			 initShareHolderInfoTable(row.corpId);
			 attachInfoTable(row.corpId);
	    },
	    'click .modify': function (e, value, row, index) {
	    	if($(e.target).data('type')==="shareInfo"){
	    		//修改
	    		modShareFun(row);
	    		shareDetailRow = row;//吧数据存进全局变量里
	    		shareIndex = index;
	    	}
	    },
	    'click .remove':function (e, value, row, index) {
	    	var attachData = $('#attachInfoTable').bootstrapTable('getData');
	    	var contractData = $('#contractInfoTable').bootstrapTable('getData');
	    	//$('#shareHolderInfoTable').bootstrapTable('removeByUniqueId', index);
	    	if($(e.target).data('type')==="shareInfo"){
	    		var values = [];
		    	values.push(row.shareHolderId);
		    	$('#shareHolderInfoTable').bootstrapTable('remove', {field: 'shareHolderId', values: values});
	    	}else if ($(e.target).data('type')==="attach"){
	    		attachData.length - 1;
	    		var values = [];
		    	values.push(row.fileUrl);
		    	$('#attachInfoTable').bootstrapTable('remove', {field: 'fileUrl', values: values});
	    	}else if ($(e.target).data('type')==="contract"){
	    		contractData.length - 1;
	    		var values = [];
		    	values.push(row.contractid);
		    	$('#contractInfoTable').bootstrapTable('remove', {field: 'contractid', values: values});
	    	}
		},
	    'click .yulan': function (e, value, row, index) {
	    	window.open("../.." + row.fileUrl);//预览pdf的js方法
	    }
 };
 
 function subFileNum() {
    var num = Number($("#fileNum").val());
    $("#fileNum").val(num - 1);
}
 
 function modShareFun(row){
    $("#addshareInfoModalLabel").text("修改");
	$('#shareInfoModal').modal();
	CloudUtils.setForm(row,'shareInfoForm');
 }
 
 var orginData = null;//存储原先数据
 function initDetailForm(corpId){
	 var data = {
			 sysType: 4,  
			 corpId:corpId
	 };
	 var options = {
				url : '../custInfo/list',
				data: JSON.stringify(data),
				callBackFun : function(data) {
					if (data.result == 0) {
						changeArea(data.dataList[0].area);
						CloudUtils.setForm(data.dataList[0],'detailForm');
						if(data.dataList[0].companyPicturePath1!=null && data.dataList[0].companyPicturePath1!=''){
							$("#Path1").attr("src",data.dataList[0].companyPicturePath1);
						}
						if(data.dataList[0].companyPicturePath2!=null && data.dataList[0].companyPicturePath2!=''){
							$("#Path2").attr("src",data.dataList[0].companyPicturePath2);
						}
						if(data.dataList[0].companyPicturePath3!=null && data.dataList[0].companyPicturePath3!=''){
							$("#Path3").attr("src",data.dataList[0].companyPicturePath3);
						}
						if(data.dataList[0].companyPicturePath4!=null && data.dataList[0].companyPicturePath4!=''){
							$("#Path4").attr("src",data.dataList[0].companyPicturePath4);
						}
						if(data.dataList[0].companyPicturePath5!=null && data.dataList[0].companyPicturePath5!=''){
							$("#Path5").attr("src",data.dataList[0].companyPicturePath5);
						}
						if(data.dataList[0].companyPicturePath6!=null && data.dataList[0].companyPicturePath6!=''){
							$("#Path6").attr("src",data.dataList[0].companyPicturePath6);
						}
						if(data.dataList[0].businessLicensePath!=null && data.dataList[0].businessLicensePath!=''){
							$("#businessLicensePath2").attr("src",data.dataList[0].businessLicensePath);
						}
						if(data.dataList[0].permissionAccountPath!=null && data.dataList[0].permissionAccountPath!=''){
							$("#permissionAccountPath2").attr("src",data.dataList[0].permissionAccountPath);
						}
						if(data.dataList[0].legalIdNumberPath1!=null && data.dataList[0].legalIdNumberPath1!=''){
							$("#legalIdNumberPath11").attr("src",data.dataList[0].legalIdNumberPath1);
						}
						if(data.dataList[0].legalIdNumberPath2!=null && data.dataList[0].legalIdNumberPath2!=''){
							$("#legalIdNumberPath22").attr("src",data.dataList[0].legalIdNumberPath2);
						}
						$("#corpNameTitle").text(data.dataList[0].corpName);
						orginData = data.dataList[0];
					} else {
						return false;
					}
				},
				errorCallback : function(data) {
					bootbox.alert(data.resultNote);
					return false;
				}
			};
 	 CloudUtils.ajax(options);
 }
 function addFun(type){
	 //type  1. 新增股东 2. 新增合同信息 3.新增附件
	 if(type === 1){
		 $("#addshareInfoModalLabel").text("添加");
		 $("#shareInfoModal").modal();
	 }else if(type==2){
		 $("#contractInfoModal").modal(); 
	 }else if(type==3){
		 $("#fjModal").modal(); 
	 }
 }
 //取消
 function cancel(){
	 $('#mainFrame',top.document).attr('src','project/dykManager/agencyManager.html');
 }
 function isDzIdExit(){
		var options = {
				url : '../agency/isIdExit?dzId='+$("#dzId").val(),
				data : {},
				callBackFun : function(data) {
					if(data.result==0){
						canDzSubmit = true;
					}else{
						console.log($("#corpId").val());
						if(data.resultNote==$("#corpId").val())
							{
							canDzSubmit= true;
							}
						else
							{
							canDzSubmit =false;
							}
						
					}
				},
				errorCallback:function(data){
					bootbox.alert("error");
				}
		};
		CloudUtils.ajax(options);
	}

	function isLsIdExit(){
		var options = {
				url : '../agency/isIdExit2?lsId='+$("#lsId").val(),
				data : JSON.stringify(),
				callBackFun : function(data) {
					if(data.result==0){
						canLsSubmit = true;
					}else{
						if(data.resultNote==$("#corpId").val())
						{
							canLsSubmit = true;
						}
						else
							{
							canLsSubmit =false;
							}
					
					}
				},
				errorCallback:function(data){
					bootbox.alert("error");
				}
		};
		CloudUtils.ajax(options);
	}
 function saveFun(type){//0.基础数据1股东2.合同信息
	if(type === 0){//整个基础数据
		 if(roleId == 'ROLE000016'){
			 subCorpInfo();
		 }else {
			 $('#detailForm').data('bootstrapValidator').validate();
			 if(!$('#detailForm').data('bootstrapValidator').isValid()){  
				    //没有通过校验 
				 return false;
			 }else{
				 subCorpInfo();
			 }
		 }
		 
	}
	 if(type ===1 ){//股东
		 $('#shareInfoForm').data('bootstrapValidator').validate();
		 if(!$('#shareInfoForm').data('bootstrapValidator').isValid()){  
			    //没有通过校验 
			 return false;
		 }
			  var data = CloudUtils.convertStringJson('shareInfoForm');
			  data = eval("(" + data + ")");
			 
			  data.shareHolderId=CloudUtils.getUUID(32, 63);
			  data.shareProportion = data.shareProportion ==""?0:data.shareProportion;
			  data.registeredCapital = data.registeredCapital ==""?0:data.registeredCapital;
			  data.registeredCapitalProportion = data.registeredCapitalProportion ==""?0:data.registeredCapitalProportion;
//					 先只在页面显示，不录入数据库
			 $("#shareHolderInfoTable").bootstrapTable('append', data);
			$("#shareInfoModal").modal("hide");
	 }
	 if(type ===2 ){//合同
//		 $('#contractForm').data('bootstrapValidator').validate();
//		 if(!$('#contractForm').data('bootstrapValidator').isValid()){  
//			    //没有通过校验 
//			 return false;
//		 }
			  var data = CloudUtils.convertStringJson('contractForm');
			  data = eval("(" + data + ")");
			
			  data.contractid=CloudUtils.getUUID(32, 63);
			  data.contractName = data.contractName ==""?0:data.contractName;
			  data.contractNum = data.contractNum ==""?0:data.contractNum;
			  data.contractType = data.contractType ==""?0:data.contractType;
			  data.endDate = data.endDate ==""?0:data.endDate;
			  data.uploadFileName = data.uploadFileName ==""?0:data.uploadFileName;
//					 先只在页面显示，不录入数据库
			 $("#contractInfoTable").bootstrapTable('append', data);
			$("#contractInfoModal").modal("hide");
	 }
 }
 
 function subCorpInfo(){

	 isDzIdExit();
	 isLsIdExit();
	 if($("#maxCreditAmount").val() > 0){
			if(!$("#dzId").val()){
				bootbox.alert("大宗ID不能为空");
				return false;
			}
			if(!canDzSubmit){
				bootbox.alert("大宗ID与数据库重复");
				return false;
			}
		}else if($("#maxLscreditAmount").val() > 0){
			if(!$("#lsId").val()){
				bootbox.alert("零售ID不能为空");
				return false;
			}
			if(!canLsSubmit){
				bootbox.alert("零售ID与数据库重复");
				return false;
			}
		}else{
			bootbox.alert("零售和大宗额度,ID至少要有一个");
			return false;
		}
	 //			保存到数据库
	 var data = CloudUtils.convertStringJson('detailForm');
	 console.log(data);
	 var jsonData = eval("(" + data + ")");
     jsonData.regCap = jsonData.regCap == "" ? 0 : jsonData.regCap;
     jsonData.maxLscreditAmount = jsonData.maxLscreditAmount == "" ? 0 : jsonData.maxLscreditAmount;
     jsonData.maxCreditAmount = jsonData.maxCreditAmount == "" ? 0 : jsonData.maxCreditAmount;
     var allTableData = $('#shareHolderInfoTable').bootstrapTable('getData');
  /*   var regCap = $("#regCap").val() == "" ? 0 : $("#regCap").val();
     var sum = 0;
    	for(var i = 0; i < allTableData.length; i++){
    		var registeredCapital = allTableData[i].registeredCapital;
    		sum = sum + Number(registeredCapital);
    		if(Number(regCap) < Number(sum)){
    			bootbox.alert("注册资本份额不得超过注册资本，请修改！");
    			return false;
    		}
    	}*/
     var attachData = $('#attachInfoTable').bootstrapTable('getData');
     var contractData = $('#contractInfoTable').bootstrapTable('getData');
     jsonData.shareInfoList = allTableData;
     jsonData.attachInfoList = attachData;
     jsonData.contractInfoList = contractData;
//     jsonData = editUniqueCust(jsonData);
     if(roleId == 'ROLE000016')
 	{
    	 var options = {
 				url : '../custInfo/mod',
 				data : JSON.stringify(jsonData),
 				callBackFun : function(data) {
 				
 				    if (data.result == 0) {
 	                    bootbox.alert(data.resultNote, function() {
 	                        window.location.href = '../project/dykManager/agencyManager.html';
 	                    });
 	                } else {
 	                    bootbox.alert(data.resultNote);
 	                    return false;
 	                }
 				},
 				errorCallback : function(data) {
 					bootbox.alert(data.resultNote);
 					return false;
 				}
 			};
    	 CloudUtils.ajax(options);
 	}
     else 
    	 {
    	 var options = {
	 				url : '../custInfo/startProcess',
	 				data : JSON.stringify(jsonData),
	 				callBackFun : function(data) {
	 			
	 				    if (data.result == 0) {
	 	                    bootbox.alert(data.resultNote, function() {
	 	                        window.location.href = '../pubManager/companyManager.html';
	 	                    });
	 	                } else {
	 	                    bootbox.alert(data.resultNote);
	 	                    return false;
	 	                }
	 				},
	 				errorCallback : function(data) {
	 					bootbox.alert(data.resultNote);
	 					return false;
	 				}
	 			};
	    	 CloudUtils.ajax(options);
    	 }
 
 }
 
//初始化股东信息表
 function initShareHolderInfoTable(corpId){
	 $('#shareHolderInfoTable').bootstrapTable('destroy'); 
		$("#shareHolderInfoTable").bootstrapTable({  
	         method: "post", 
	         url: "../shareHolder/list", 
	         //striped: true,  //表格显示条纹  
	         //pagination: true, //启动分页  
	         //pageSize: 5,  //每页显示的记录数  
	         //pageNumber:1, //当前第几页  
	        // pageList: [5, 10, 15, 20, 25],  //记录数可选列表  
	         search: false,  //是否启用查询  
	         showColumns: false,  //显示下拉框勾选要显示的列  
	         showRefresh: false,  //显示刷新按钮  
	         sidePagination: "server", //表示服务端请求  
	         //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
	         //设置为limit可以获取limit, offset, search, sort, order  
	         queryParamsType : "undefined",   
	         queryParams: function queryParams(params) {   //设置查询参数  
	            // var data = CloudUtils.convertStringJson('searchForm');
	            // var jsonData = eval("(" + data + ")");
	             var param = {    
		                 pageNumber: params.pageNumber,    
		                 pageSize: params.pageSize
		             }; 
				 if(corpId){
					 param.corpId = corpId            	 
	             } 
	             return JSON.stringify(param);                   
	           }, 
	         responseHandler:function responseHandler(res) {
	        	 if (res.result==0) {
		        	 return {
		        		 "rows": res.dataList,
		        		 "total": res.records
		        	 };

	        	 } else {
	        		 bootbox.alert(res.resultNote);
	        		 return {
				        	 "rows": [],
				        	 "total": 0
				        	 };
	        	 }
	         },
	         columns: [{
		 	        field: 'shareHolderId',
		 	        title: '股东Id',
		 	        align: 'center',
		            valign: 'middle',
		 	        visible:false
		 	    },{
	 	        field: 'shareName',
	 	        title: '股东名称',
	 	        align: 'center',
	             valign: 'middle'
	 	    }, {
	 	        field: 'shareProportion',
	 	        title: '持股比例(%)',
	 	        align: 'center',
	             valign: 'middle',
			    formatter:function(value){
				  return $.number(value,2);
	            }
	 	    }, {
	 	        field: 'registeredCapital',
	 	        title: '注册资本份额',
	 	        align: 'center',
	             valign: 'middle',
			    formatter:function(value){
			    	return $.number(value,2);
	            }
	 	    }, {
	 	        field: 'registeredCapitalProportion',
	 	        title: '注册资本占比(%)',
	 	        align: 'center',
	             valign: 'middle',
			    formatter:function(value){
			    	return $.number(value,2);
	            }
	 	    }, {
	 	        field: 'operation',
	 	        title: '操作',
	 	        align: 'center',
	            valign: 'middle',
	 	        formatter:function(value,row,index){
	 	        	var r = '<a class = "fa fa-trash-o remove" style="color:#278bdd;padding:0px 5px;" title="删除" data-type="shareInfo" href="javascript:void(0)"></a>';
	 	        	var m = '<a class = "fa fa-edit modify" style="color:#278bdd;padding:0px 5px;" title="编辑" data-type="shareInfo" href="javascript:void(0)"></a>';
	 	            return m +' '+ r;
	 	        },
	 	        events: 'operateEvents'
	 	    }
	 	    ]
	       });  
 }
 
 
//初始化合同信息表
 function initcontractInfoTable(corpId){
	 $('#contractInfoTable').bootstrapTable('destroy'); 
		$("#contractInfoTable").bootstrapTable({  
	         method: "post", 
	         url: "../contractinfo/list", 
	         //striped: true,  //表格显示条纹  
	         //pagination: true, //启动分页  
	         //pageSize: 5,  //每页显示的记录数  
	         //pageNumber:1, //当前第几页  
	        // pageList: [5, 10, 15, 20, 25],  //记录数可选列表  
	         search: false,  //是否启用查询  
	         showColumns: false,  //显示下拉框勾选要显示的列  
	         showRefresh: false,  //显示刷新按钮  
	         sidePagination: "server", //表示服务端请求  
	         //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
	         //设置为limit可以获取limit, offset, search, sort, order  
	         queryParamsType : "undefined",   
	         queryParams: function queryParams(params) {   //设置查询参数  
	            // var data = CloudUtils.convertStringJson('searchForm');
	            // var jsonData = eval("(" + data + ")");
	             var param = {    
		                 pageNumber: params.pageNumber,    
		                 pageSize: params.pageSize
		             }; 
				 if(corpId){
					 param.corpId = corpId            	 
	             } 
	             return JSON.stringify(param);                   
	           }, 
	         responseHandler:function responseHandler(res) {
	        	 if (res.result==0) {
		        	 return {
		        		 "rows": res.dataList,
		        		 "total": res.records
		        	 };

	        	 } else {
	        		 bootbox.alert(res.resultNote);
	        		 return {
				        	 "rows": [],
				        	 "total": 0
				        	 };
	        	 }
	         },
	         columns: [
	            {
		 	        field: 'contractid',
		 	        title: '合同id',
		 	        align: 'center',
		            valign: 'middle',
		            visible:false
		 	    },{
		 	        field: 'contractName',
		 	        title: '合同名称',
		 	        align: 'center',
		            valign: 'middle',
		 	    },{
		 	        field: 'contractNum',
		 	        title: '合同编号',
		 	        align: 'center',
		 	        valign: 'middle'
		 	    }, {
		 	        field: 'contractType',
		 	        title: '业务类型',
		 	        align: 'center',
		             valign: 'middle',
		 	    }, {
		 	        field: 'endDate',
		 	        title: '合同到期日',
		 	        align: 'center',
		             valign: 'middle',
		 	    },{
		 	        field: 'fileName',
		 	        title: '合同pdf名称',
		 	        align: 'center',
		            valign: 'middle',
		            visible:false
		 	    },{
		 	        field: 'fileUrl',
		 	        title: '合同地址',
		 	        align: 'center',
		            valign: 'middle',
		            visible:false
		 	    }, {
		 	        field: 'operation',
		 	        title: '操作',
		 	        align: 'center',
		            valign: 'middle',
		 	        formatter:function(value,row,index){
		 	        	var r = '<a class = "fa fa-trash-o remove" style="color:#278bdd;padding:0px 5px;" title="删除" data-type="contract" href="javascript:void(0)"></a>';
		 	        	var m = '<a class = "glyphicon glyphicon-file yulan" style="color:#278bdd;padding:0px 5px;" title="预览" data-type="contract" href="javascript:void(0)"></a>';
		 	            return  r+"  "+m;
		 	        },
		 	        events: 'operateEvents'
		 	    }
	 	    ]
       });  
 }
 
 function getFormInfo() {
    var row = store.get('custRow'); //从缓存中获取数据
    var corpId = store.get('corpId'); //从缓存中获取数据
    console.log("isEdit= "+isEdit);
    console.log(row);
    console.log(corpId);
    if(row!=null && row.corpId != null){
    	if(isEdit=="false"){
    		detailFun();
    	}
    	initDetailForm(row.corpId);
		initShareHolderInfoTable(row.corpId);
		attachInfoTable(row.corpId);
		initcontractInfoTable(row.corpId);
		$("#editCorp").hide();
    }else if(row == null && corpId != null){
    	detailFun();
    	initDetailForm(corpId);
		initShareHolderInfoTable(corpId);
		attachInfoTable(corpId);
		initcontractInfoTable(corpId);
		document.getElementById("cancel").style.display = "none";
    }
        
   

}
 
 function detailFun() {
	    $('#detailForm input').attr('readonly', true);
	    $('#shareInfoForm input').attr('readonly', true);
	    $("select").attr("disabled", true);
	    document.getElementById("btn_add").style.display = "none";
	    document.getElementById("btn_save").style.display = "none";
	    document.getElementById("btn_contract").style.display = "none";
	    document.getElementById("addContractInfo").style.display = "none";
	    document.getElementById("saveCorpInfo").style.display = "none";
	    document.getElementById("cp1").style.display = "none";
	    document.getElementById("cp2").style.display = "none";
	    document.getElementById("cp3").style.display = "none";
	    document.getElementById("cp4").style.display = "none";
	    document.getElementById("cp5").style.display = "none";
	    document.getElementById("cp6").style.display = "none";
	    document.getElementById("bl").style.display = "none";
	    document.getElementById("pa").style.display = "none";
	    document.getElementById("lin1").style.display = "none";
	    document.getElementById("lin2").style.display = "none";
	}
 
 function edit(){
	 $('#detailForm input').attr('readonly', false);
	    $('#shareInfoForm input').attr('readonly', false);
	    $("select").attr("disabled", false);
	    $("#btn_add").show();
	    $("#btn_save").show();
	    $("#btn_contract").show();
	    $("#addContractInfo").show();
	    $("#saveCorpInfo").show();
	    $("#cp1").show();
	    $("#cp2").show();
	    $("#cp3").show();
	    $("#cp4").show();
	    $("#cp5").show();
	    $("#cp6").show();
	    $("#bl").show();
	    $("#pa").show();
	    $("#lin1").show();
	    $("#lin2").show();
 }
 
 function changeArea(areaVal) {
	$("#represent").empty();
	if (areaVal == '0') {
		$("#represent").append("<option value='0'>南京</option>")
						.append("<option value='1'>上海</option>");
	} else if (areaVal == '1') {
		$("#represent").append("<option value='2'>西安</option>")
						.append("<option value='3'>成都</option>");
	} else if (areaVal == '2') {
		$("#represent").append("<option value='4'>广州</option>")
						.append("<option value='5'>武汉</option>")
						.append("<option value='6'>郑州</option>");
	} else if (areaVal == '3') {
		$("#represent").append("<option value='7'>北京</option>")
						.append("<option value='8'>沈阳</option>")
						.append("<option value='9'>济南</option>");
	}
}
 
// 添加附件信息
function attachInfoTable(corpId){
	 $('#attachInfoTable').bootstrapTable('destroy'); 
		$("#attachInfoTable").bootstrapTable({  
	         method: "post", 
	         url: "../uploadFile/list", 
	         search: false,  //是否启用查询  
	         showColumns: false,  //显示下拉框勾选要显示的列  
	         showRefresh: false,  //显示刷新按钮  
	         sidePagination: "server", //表示服务端请求  
	         //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
	         //设置为limit可以获取limit, offset, search, sort, order  
	         queryParamsType : "undefined",   
	         queryParams: function queryParams(params) {   //设置查询参数  
	             var param = {    
	                 pageNumber: params.pageNumber,    
	                 pageSize: params.pageSize
	             }; 
	             if(corpId){
					 param.corpId = corpId            	 
	             } 
	             return JSON.stringify(param);                   
	           }, 
	         responseHandler:function responseHandler(res) {
	        	 if (res.result==0) {
		        	 return {
		        		 "rows": res.dataList,
		        		 "total": res.records
		        	 };

	        	 } else {
	        		 bootbox.alert(res.resultNote);
	        		 return {
				        	 "rows": [],
				        	 "total": 0
				        	 };
	        	 }
	         },
	         columns: [{
	 	        field: 'fileUrl',
	 	        title: '附件地址',
	 	        align: 'center',
	            valign: 'middle',
	            visible: false
		 	},{
	 	        field: 'uploadType',
	 	        title: '附件格式',
	 	        align: 'center',
	            valign: 'middle'
	 	    },{
	 	        field: 'fileName',
	 	        title: '附件名称',
	 	        align: 'center',
	             valign: 'middle',
	             formatter:function(value,row,index){
					 var s = '<a target="view_window" href="/../..'+row.fileUrl+'" download="'+value+'">'+value+'</a>';
			         return s;
		           
		        }
	 	    }, {
	 	        field: 'attachType',
	 	        title: '附件格式',
	 	        align: 'center',
	             valign: 'middle'
	 	    }, {
	 	        field: 'attachSize',
	 	        title: '附件大小(KB)',
	 	        align: 'center',
	             valign: 'middle'
	 	    }, {
	 	        field: 'operation',
	 	        title: '操作',
	 	        align: 'center',
	            valign: 'middle',
	 	        formatter:function(value,row,index){
	 	        	var r = '<a class = "fa fa-trash-o remove" style="color:#278bdd;padding:0px 5px;" title="删除" data-type="attach" href="javascript:void(0)"></a>';
	 	        	var m = '<a class = "glyphicon glyphicon-file yulan" style="color:#d864fd;padding:0px 5px;" title="预览" data-type="attach" href="javascript:void(0)"></a>';
	 	            return r+"  "+m;
	 	        },
	 	        events: 'operateEvents'
	 	    }
	 	    ]
	       });  
}

function shareFormValidator(){
 	$('#shareInfoForm').bootstrapValidator({
 	      message: 'This value is not valid',
 	      excluded:':disabled',
 	      feedbackIcons: {
 	          valid: 'glyphicon glyphicon-ok',
 	          invalid: 'glyphicon glyphicon-remove',
 	          validating: 'glyphicon glyphicon-refresh'
 	      },
 	      fields: {
 	    	 shareName: {
	              validators: {
	                  notEmpty: {
	                      message: '股东名称不能为空'
	                  },
	                  stringLength: {
			              max: 16,
			              message: '股东名称不能超过16'
			          },
	              }
	          },
 	    	 shareProportion: {
 	    		 validators: {
 	    			 notEmpty: {
	                      message: '股东持股比例不能为空'
	                  },
	    			  numeric: {message: '只能输入数字'},
		              callback: {  
	                       message: '比例在0~100之间',  
	                       callback: function(value, validator) { 
	                    	    var shareProportionSum = parseFloat(getShareSum("shareProportion"));
	                        	return value =="" || (parseFloat(value)>=0&&(parseFloat(value)+shareProportionSum)<=100);
	                         }  
	                     } 
 	    		 }
 	    	 },
 	    	registeredCapitalProportion:{
 	    		validators: {
 	    			notEmpty: {
	                      message: '注册资本占比不能为空'
	                  },
	            	  numeric: {message: '只能输入数字'},
		              callback: {  
		            	  message: '比例在0~100之间',  
	                       callback: function(value, validator) { 
	                    	   var registeredCapitalProportionSum = parseFloat(getShareSum("registeredCapitalProportion"));
	                    	   return value =="" || (parseFloat(value)>=0&&(parseFloat(value)+registeredCapitalProportionSum)<=100);
	                         }  
	                     } 
	              }
 	    	}
 	      }
 		})
 		.on('success.form.bv', function (e) {
 			e.preventDefault();
 		});	
 }
//获取股东表中的数据和
function getShareSum(type){
	var shareInfo = $('#shareHolderInfoTable').bootstrapTable('getData');
	var sum = 0;
	$.each(shareInfo, function(i, item){
		sum = CloudUtils.Math(sum,eval('item.'+type),'add');
	});
	//	如果是修改需要减去当前选中的值
	if(!isEdit){
		sum = CloudUtils.Math(sum,eval('shareDetailRow.'+type),'sub');
	}
	return sum;
}

function formValidator(){
 	$('#detailForm').bootstrapValidator({
 	      message: 'This value is not valid',
 	      excluded: ':disabled',
 	      feedbackIcons: {
 	          valid: 'glyphicon glyphicon-ok',
 	          invalid: 'glyphicon glyphicon-remove',
 	          validating: 'glyphicon glyphicon-refresh'
 	      },
 	      fields: {
 	    	 corpName:{
 	    		validators: {
 	    			notEmpty: {
	                      message: '企业名称不能为空'
	                  },
	                  stringLength: {
			              max: 32,
			              message: '企业名称不能超过32'
			          },
 	    		}
 	    	 },
// 	    	orgnNum:{
// 	    		validators: {
// 	    			notEmpty: {
//	                      message: '社会统一信用代码证号不能为空'
//	                  },
//	                  regexp: {
//                          regexp: /[A-Z0-9]{18}/, 
//                          message: '社会统一信用代码证号格式为18位大写拉丁字母及数字混合'
//                      },
//                      stringLength: {
//                          max: 18,
//                          message: '社会统一信用代码证号长度不能超过18'
//                      },
// 	    		}
// 	    	 },
 	    	corpType:{
 	    		validators: {
 	    			notEmpty: {
	                      message: '企业类型不能为空'
	                  },
 	    		}
 	    	 },
 	    	legalPerson:{
 	    		validators: {
 	    			notEmpty: {
	                      message: '法定代表人不能为空'
	                  },
	                  stringLength: {
			              max: 32,
			              message: '法定代表人不能超过32'
			          },

 	    		}
 	    	 },
 	    	regCap: {
 	    		validators: {
            	    numeric: {message: '只能输入数字'},
	                callback: {  
                       message: '金额在0~1000000000之间',  
                       callback: function(value, validator) { 
                        	return value =="" || (parseFloat(value)>=0&&parseFloat(value)<=1000000000);
                         }  
                     } 
	              }
 	    	},
	    	contactInfo: {
	              validators: {
	            	  notEmpty: {
	                      message: '手机号不能为空'
	                  },
	                  regexp: {
	                      regexp: /^1(3|4|5|7|8)\d{9}$/,
	                      message: '请输入11位真实手机号码'
	                  }
	              }
	          },
	          officeAddress:{
	        	  validators: {
	        		  notEmpty: {
	                      message: '地址不能为空'
	                  },
	                  stringLength: {
			              max: 32,
			              message: '地址不能超过32'
			          },
	        	  }
	          },
	          fixedPhone:{
	        	validators: {
	        		regexp: {
	                      regexp: /^0\d{2,4}-\d{7,8}$/,
	                      message: '请输入正式号码为区号-电话号'
	                  }
	        	}
	          }
 	      }
 		})
 		.on('success.form.bv', function (e) {
 			e.preventDefault();
 		});	
 }

//修改唯一性判断
 function editUniqueCust(data){
//	获取原来的corpName和orgnNum
	 if(orginData.corpName==data.corpName){
		 data.corpName = null;
	 }
	 if(orginData.orgnNum ==data.orgnNum){
		 data.orgnNum = null;
	 }
	 return data;
}
 
function numFormat(){
 	$("#regCap").number(true, 2);
 	$("#shareProportion").number(true, 2);
 	$("#registeredCapital").number(true, 2);
 	$("#registeredCapitalProportion").number(true, 2);
 	$("#maxLscreditAmount").number(true, 2);
 	$("#maxCreditAmount").number(true, 2);
 }

function propertychange(){
	$('#shareProportion,#registeredCapital,#registeredCapitalProportion').bind('keyup', function(event) {
		var keycode = event.which; 
		     if(keycode==8){
		    	 if(event.target.value==""){
		    		 $("#"+event.target.id).val(0.00);
		    		 $("#shareInfoForm").data('bootstrapValidator').destroy();
		    		 shareFormValidator();
		    		 $("#shareInfoForm").data("bootstrapValidator").validate();
		    	 }
		    } 
	});
}

function ajaxFileUpload(){
	$('#file').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	var relData = {};
	            	relData.fileName = data.fileName;
	            	relData.attachSize = data.fileSize;
	            	relData.fileUrl = data.fileUrl;
	            	relData.attachType = data.fileType;
	            	relData.uploadType = $("#uploadType").val();
	            	$("#attachInfoTable").bootstrapTable("append", relData);
	            	$("#fjModal").modal("hide");
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#file').bind('fileuploadadd', function (e, data) {
 		var obj = data.files[0];
 		var name = obj.name;
 		var size = obj.size;
 		var uploadtype = $("#uploadType").val();
 		/*if (!checkFileNum()) {
	            bootbox.alert("上传的附件数不能超过10个");
	            return false;
	        }*/
 		var attachData = $('#attachInfoTable').bootstrapTable('getData');
        if (attachData.length > 9) {
            bootbox.alert("上传的附件数不能超过10个");
            return false;
        }
        var type = name.substr(name.lastIndexOf(".")).toLowerCase();
        if(uploadtype!= null && uploadtype != "实际控制人婚姻证明"){
        	if(type != ".pdf"){
        		bootbox.alert("仅支持上传pdf类型的文件");
                return false;
        	}
        }else if(uploadtype!= null && uploadtype == "实际控制人婚姻证明"){
        	if(type == ".jpg" || type == ".png" || type == ".jpeg"){
        		
        	}else{
        		bootbox.alert("仅支持上传jpg,png,jpeg类型的文件");
                return false;
        	}
        }
//        if (!checkFileType(type)) {
//            bootbox.alert("仅支持上传word、excel、pdf、png、jpg类型的文件");
//            return false;
//        }
 		
		 if (!checkFileSize(size)) {
	        bootbox.alert("上传文件不超过50M");
            return false;
	     }
	   
 	});
	
	$('#cp1').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path1").attr("src",data.fileUrl);
	            	$("#companyPicturePath1").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp1').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#cp2').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path2").attr("src",data.fileUrl);
	            	$("#companyPicturePath2").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp2').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#cp3').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path3").attr("src",data.fileUrl);
	            	$("#companyPicturePath3").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp3').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#cp4').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path4").attr("src",data.fileUrl);
	            	$("#companyPicturePath4").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp4').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#cp5').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path5").attr("src",data.fileUrl);
	            	$("#companyPicturePath5").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp5').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#cp6').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#Path6").attr("src",data.fileUrl);
	            	$("#companyPicturePath6").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#cp6').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#bl').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#businessLicensePath2").attr("src",data.fileUrl);
	            	$("#businessLicensePath").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#bl').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#pa').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#permissionAccountPath2").attr("src",data.fileUrl);
	            	$("#permissionAccountPath").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#pa').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#lin1').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#legalIdNumberPath11").attr("src",data.fileUrl);
	            	$("#legalIdNumberPath1").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#lin1').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#lin2').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#legalIdNumberPath22").attr("src",data.fileUrl);
	            	$("#legalIdNumberPath2").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#lin2').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type ==".jpg" || type == ".png"){
		}else{
			bootbox.alert("仅支持上传png、jpg类型的图片");
			return false;
		}
	});
	
	$('#contractfile').fileupload({
		  url:"../file/uploadFile?pathId=3",
	        dataType: 'json',
	        // 上传完成后的执行逻辑
	        done: function(e, data) {
	        	data = data.result;
	            if(data.result==0){
	            	$("#fileName").val(data.fileName);
	            	$("#fileUrl").val(data.fileUrl);
	            } else {
	            	 bootbox.alert(data.resultNote);
	            }
		            
		     }
	});
	$('#contractfile').bind('fileuploadadd', function (e, data) {
		var obj = data.files[0];
		var name = obj.name;
		var type = name.substr(name.lastIndexOf(".")).toLowerCase();
		if(type !=".pdf"){
			bootbox.alert("仅支持上传pdf类型的图片");
			return false;
		}
	});
}

var fileTypes = [".doc", ".xls", ".xlsx", ".docx", ".pdf", ".png", ".jpg"];

function checkFileType(type) {
    var result = $.inArray(type, fileTypes);
    if (result == -1) {
        return false;
    }
    return true;
}

function checkFileSize(fileSize) {
    fileSize = Math.round(fileSize / 1024 * 100) / 100; //单位为KB
    fileSize = Math.round(fileSize / 1024);
    if (fileSize > 50) {
        return false;
    }
    return true;
}

function showImg(val){
	var imgSrc;
	if(val == 1){
		imgSrc=$("#companyPicturePath1").val();
	}else if(val == 2){
		imgSrc=$("#companyPicturePath2").val();
	}else if(val == 3){
		imgSrc=$("#companyPicturePath3").val();
	}else if(val == 4){
		imgSrc=$("#companyPicturePath4").val();
	}else if(val == 5){
		imgSrc=$("#companyPicturePath5").val();
	}else if(val == 6){
		imgSrc=$("#companyPicturePath6").val();
	}else if(val == 7){
		imgSrc=$("#businessLicensePath").val();
	}else if(val == 8){
		imgSrc=$("#permissionAccountPath").val();
	}else if(val == 9){
		imgSrc=$("#legalIdNumberPath1").val();
	}else if(val == 10){
		imgSrc=$("#legalIdNumberPath2").val();
	}
	  CloudUtils.getTab("../pubManager/imageShow.html", "imgPreviewDiv");  	
	  $("#img").attr('src',imgSrc);
	  $("#imgPreviewShow").modal("show");
}
