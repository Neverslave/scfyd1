$(document).ready(function() {
	$("form").attr("autocomplete","off");
	CloudUtils.getMenuNames("nav");
	//modal绑定事件
	$('#addModal').on('hidden.bs.modal', function(){
		$("#addForm")[0].reset();
	});
	initTable();

});



function searchFun() {
	initTable();
}

function initTable() { 
	$('#agencyProjectListTable').bootstrapTable('destroy');  
	$("#agencyProjectListTable").bootstrapTable({  
         method: "post", 
         url: "../../supplierProject/list",
         striped: false,  //表格显示条纹  
         pagination: true, //启动分页  
         pageSize: 20,  //每页显示的记录数  
         pageNumber:1, //当前第几页  
         pageList: [20, 50, 100, 200, 500],  //记录数可选列表  
         search: false,  //是否启用查询  
         showColumns: false,  //显示下拉框勾选要显示的列  
         showRefresh: false,  //显示刷新按钮  
         sidePagination: "server", //表示服务端请求  
         //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
         //设置为limit可以获取limit, offset, search, sort, order  
         queryParamsType : "undefined",   
         queryParams: function queryParams(params) {   //设置查询参数  
           $("#sysType").val(4);
           var data = CloudUtils.convertStringJson('searchForm');
           var jsonData = JSON.parse(data);
           var param = {    
               pageNumber: params.pageNumber,    
               pageSize: params.pageSize,
               agencyNum: jsonData.txt_agencyCode,
               corpName: jsonData.txt_agencyName,
        
               sysType:jsonData.sysType
               
           };    
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
  	        field: 'corpName',
  	        title: '供应商名称',
  	        align: 'center',
  	     	width: 250,
             valign: 'middle'
  	    },{
 	        field: 'corpId',
 	        title: '供应商ID',
 	        align: 'center',
            valign: 'middle',
            visible: false
 	    }, {
 	        field: 'agencyNum',
 	        title: '供应商代码',
 	        align: 'center',
            valign: 'middle'
        },{
 	        field: 'projectName',
 	        title: '项目名称',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'projectDescribe',
 	        title: '项目描述',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'projectContract',
 	        title: '项目合同',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'projectInvoice',
 	        title: '项目发票',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'projectQua',
 	        title: '项目资质',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'projectAccept',
 	        title: '验收文件',
 	        align: 'center',
            valign: 'middle'
 	    },{
 	        field: 'systemTime',
 	        title: '操作时间',
 	        align: 'center',
            valign: 'middle'
 	    }]
       });  
}


function accAgency() {
	$('#mainFrame',top.document).attr('src','supplierManager/project/projectAddManager.html');
}

