$(function() {
	$('#pie_2').highcharts({
		chart: {
			type: 'bar',
			backgroundColor: 'rgba(255,255,255,0)',
			height: 280,
			width: 330,
			style: {
				"fontSize": "8px"
			}
		},
		exporting: {
			enabled: false
		},
		credits: {
			enabled: false
		},
		title: {
			style: {
				"color": "#ffffff",
				"fontSize": "18px"
			},
			text: '全国立法量'
		},
		xAxis: {
			categories: ['宪法', '民法商法', '行政法', '经济法', '社会法', '刑法', '诉讼法'],
			labels:  {                       
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
				text: '数量',
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
		plotOptions: {
			series: {
				stacking: 'normal'
			}
		},
		series: [{
				name: '指引',
				data: [5, 3, 4, 7, 2, 9, 8]
			}, {
				name: '评价',
				data: [2, 2, 3, 2, 1, 9, 8]
			}, {
				name: '教育',
				data: [3, 4, 4, 2, 5, 9, 8]
			},
			{
				name: '预测',
				data: [3, 4, 4, 2, 5, 9, 8]
			},
			{
				name: '强制',
				data: [3, 4, 4, 2, 5, 9, 8]
			}
		]
	});
});