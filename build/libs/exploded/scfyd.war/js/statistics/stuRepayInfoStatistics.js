$(document).ready(function() {
    CloudUtils.getMenuNames("nav");
    initTable();
    loadDate();
});



function initTable() {
    $('#stuRepayInfoListTable').bootstrapTable('destroy');
    $("#stuRepayInfoListTable").bootstrapTable({
        method: "post",
        url: "../ssmStatistics/list",
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
            params.currentRepayDate =  $("#currentRepayDate").val();
            return JSON.stringify(params);
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
            field: 'repayDate',
            title: '还款日期',
            align: 'center',
            valign: 'middle'
        },{
            field: 'periodAll',
            title: '订单应还笔数',
            align: 'center',
            valign: 'middle'
        }, {
            field: 'periodRepay',
            title: '实际还款笔数',
            align: 'center',
            valign: 'middle'
        }, {
            field: 'rate1',
            title: '订单笔数逾期率',
            align: 'center',
            valign: 'middle',
            formatter: function(value,row) {
                var periodAll = Number(row.periodAll);
                var periodRepay = Number(row.periodRepay);
                var temp = (periodAll-periodRepay)/periodAll;
                return $.number(temp*100,2)+"%";
            }
        }, {
            field: 'payMAll',
            title: '订单应还金额',
            align: 'center',
            valign: 'middle',
            formatter: function(value) {
                return $.number(value, 2);
            }
        }, {
            field: 'payMRepay',
            title: '实际收到金额',
            align: 'center',
            valign: 'middle',
            formatter: function(value) {
                return $.number(value, 2);
            }
        }, {
            field: 'rate2',
            title: '订单回款金额逾期占比',
            align: 'center',
            valign: 'middle',
            formatter: function(value,row) {
                var payMAll = Number(row.payMAll);
                var payMRepay = Number(row.payMRepay);
                var temp = (payMAll-payMRepay)/payMAll;
                return $.number(temp*100,2)+"%";
            }
        }]
    });
}


function loadDate() {
    $('#currentRepayDate').datetimepicker({
        language: 'zh-CN',
        autoclose: 1,
        todayHighlight: true,
        format: 'yyyy-mm-dd',
        startView: 2,
        minView: 2,
        todayBtn: true,
        ShowUpDown:true,
        initialDate: new Date(),
        pickerPosition: "bottom-left"
    });
}