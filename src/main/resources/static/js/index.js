$(function () {
	$.getJSON('http://119.23.205.252:6969/raw_data/result', function (data){

		function returndatabyid(test) {
			var returndata = {};
			data.forEach(function(string) {
				if(test === string.id) {
					returndata = string;
				}
			}, this);
			return returndata;
		}
		
		 window.operateEvents = {
        'click .RoleOfedit': function (e, value, row, index) {
        alert(row.qxxh);
        $("#upload").modal('show');
      }
    };
		
			$('#AddFamily').bootstrapTable({
				method: 'get',
				cache: false,
				striped: true,
				pagination: true,
				pageSize: 20,
				pageNumber:1,
				pageList: [10, 20, 50, 100, 200, 500],
				search: true,
				showColumns: true,
				showRefresh: true,
				showExport: true,
				exportTypes: ['csv','txt','xml'],
				search: true,
				columns: [{"field":"articleUrl","title":"网站名称","align":"center","valign":"middle","sortable":"true"},{"field":"title","title":"标题","align":"center","valign":"middle","sortable":"true"},{"field":"publishTime","title":"发布时间","align":"center","valign":"middle","sortable":"true"},{"field":"crawlTime","title":"爬取时间","align":"center","valign":"middle","sortable":"true"},{"field":"classification","title":"分类","align":"center","valign":"middle","sortable":"true"},{"field":"publishUnits","title":"发布单位","align":"center","valign":"middle","sortable":"true"},{"field":"area","title":"地区","align":"center","valign":"middle","sortable":"true"},{ field: 'ed', title: '操作', width: 80, align: 'center',events:operateEvents,formatter: function (value, rowData, rowIndex) {
		return ["<input type='button' value='详细信息' class='shit'>", ]                          
  }
}],
				data:data,
				uniqueId:"id",
				onPageChange: function (size, number) {
					//$("#pageSizeInput").val(size);
					//$("#pageNumberInput").val(number);
					
					//var form = $('#tableForm');
					//form.action= '${base}/showReport';
					//form.submit();
                },
				onClickRow: function (row) {
				var postdata = returndatabyid(row.id);
				var myurl =encodeURI('detailed.html?articleUrl=' + postdata.articleUrl + '&StId=' + postdata.StId + '&publishTime=' + postdata.publishTime + '&crawlTime=' + postdata.crawlTime + '&classification=' + postdata.classification + '&publishUnits=' + postdata.publishUnits + '&area=' + postdata.area + '&heat=' + postdata.heat + '&annex=' + postdata.annex) ;
				var enurl = encodeURI(myurl);//使用了两次encodeRUI进行编码
			    window.location.href = enurl;
//				$(location).prop('href', myurl);
  			},  
				onlClickCell:function(field,value,row,$element){
					return false;
					},
				//onSort: function (name, order) {
               // },
				//formatShowingRows: function (pageFrom, pageTo, totalRows) {
				//	return '';
               // },
				//formatRecordsPerPage: function () {
				//	return '';
              //  },
                formatNoMatches: function(){
                	return '无符合条件的记录';
                }
				
			});
								
			$(window).resize(function () {
				$('#reportTable').bootstrapTable('resetView');
			});
		});
		});