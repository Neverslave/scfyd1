$(document).ready(function() {
	CloudUtils.getMenuNames("nav");
    initTable();
    dateload();
});

function searchFun() {
    initTable();
}

function initTable() {
    $('#proSumListTable').bootstrapTable('destroy');
    $("#proSumListTable").bootstrapTable({
        method: "post",
        url: "../SSMSummaryInfo/summaryInfoList",
        striped: false, //表格显示条纹  
        pagination: true, //启动分页  
        pageSize: 5, //每页显示的记录数  
        pageNumber: 1, //当前第几页  
        pageList: [5, 10, 15, 20, 25], //记录数可选列表  
        search: false, //是否启用查询  
        showColumns: false, //显示下拉框勾选要显示的列  
        showRefresh: false, //显示刷新按钮  
        sidePagination: "server", //表示服务端请求  
        //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
        //设置为limit可以获取limit, offset, search, sort, order  
        queryParamsType: "undefined",
        queryParams: function queryParams(params) {
            var dataTemp = CloudUtils.convertStringJson('searchForm');
            var jsonData = eval("(" + dataTemp + ")");
            jsonData.pageNumber = params.pageNumber;
            jsonData.pageSize = params.pageSize;
            return JSON.stringify(jsonData);
        },
        responseHandler: function responseHandler(res) {
            if (res.result == 0) {
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
            field: 'throwNum',
            title: '投放编号',
            align: 'center',
            valign: 'middle'
        }, {
            field: 'syncDate',
            title: '投放日期',
            align: 'center',
            valign: 'middle'
        }, {
            field: 'orderNumber',
            title: '订单数量',
            align: 'center',
            valign: 'middle'
        }, {
            field: 'repayAmount',
            title: '应还款总额',
            align: 'center',
            valign: 'middle',
            formatter:function(value){
            	return $.number(value,2);
            }
        }, {
            field: 'factoringAmount',
            title: '保理商投放金额',
            align: 'center',
            valign: 'middle',
            formatter:function(value){
            	return $.number(value,2);
            }
        }, {
            field: 'factoringReceivable',
            title: '保理商应收回款合计',
            align: 'center',
            valign: 'middle',
            formatter:function(value){
            	return $.number(value,2);
            }
        }, {
            field: 'factoringInterest',
            title: '保理应收利息合计',
            align: 'center',
            valign: 'middle',
            formatter:function(value){
            	return $.number(value,2);
            }
        }, {
            field: 'guaranteeMoney',
            title: '保证金',
            align: 'center',
            valign: 'middle',
            formatter:function(value){
            	return $.number(value,2);
            }
        }]
    });
}

function dateload() {
    $('#syncDate').datetimepicker({
        language: 'zh-CN',
        autoclose: 1,
        todayBtn: true, // 显示今天时间
        initialDate: new Date(), //初始化当前日期
        pickerPosition: "bottom-left",
        minuteStep: 5,
        format: 'yyyy-mm-dd',
        minView: 'month'　　　　 // 日期时间选择器所能够提供的最精确的时间选择视图。
    });
}