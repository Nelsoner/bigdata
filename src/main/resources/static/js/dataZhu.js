$(function() {
	$.getJSON('http://119.23.205.252:6969/result_Data/Year', function(data) {
		var year = [];
		var yeardata = [];
		data.forEach(function(string) {
			year.push(string.year);
			yeardata.push(string.num);
		}, this);
		$('#pie_1').highcharts({
			chart: {
				type: 'column',
				backgroundColor: 'rgba(0,0,0,0.25)',
				height: 280,
				width: 280
			},
			legend: {
				itemStyle: {
					"color": "#ffffff",
					"cursor": "pointer",
					"fontSize": "8px",
					"fontWeight": "bold"
				},
				itemHiddenStyle: {
					color: "rgb(0,0,0)"
				},
				reversed: true
			},
			title: {
				style: {
					"color": "#ffffff",
					"fontSize": "18px"
				},
				text: '数据量统计'
			},
			xAxis: {
				categories: year,
				crosshair: true,
				labels:  {                      
					formatter:   function ()  {                          
						return  this.value                      
					},
					 style:  {
						color:   '#fff',
						fontSize: '12px',
						fontFamily: '微软雅黑'                      
					}                  
				},
			},
			yAxis: {
				min: 0,
				title: {
					text: '数据量 (万)',
					style:  {
						"color":   '#fff'               
					}           
				},
				labels:  {                      
					 style:  {
						color:   '#fff',
						fontSize: '12px',
						fontFamily: '微软雅黑'                      
					}                  
				},
			},
			exporting: {
				enabled: false
			},
			credits: {
				enabled: false
			},
			tooltip: {
				headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
				pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
					'<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
				footerFormat: '</table>',
				shared: true,
				useHTML: true
			},
			plotOptions: {
				column: {
					pointPadding: 0.2,
					borderWidth: 0
				}
			},
			series: [{
				name: '数据量',
				data: yeardata
			}]
		});
	});
});