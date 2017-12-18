$(function () {
		    $.getJSON('http://119.23.205.252:6969/result_Data/Province', function (mydata) {
			data=JSON.stringify(mydata).replace(/num/g, "value");
		data=data.replace(/province/g,"name")
		console.log(data)
		data=$.parseJSON( data );
		// Initiate the chart
		new Highcharts.Map('map', {
			chart: {
				backgroundColor: 'rgba(0,0,0,0.25)'
			},
			title: {
				text: '立法数据分析',
				style: {
					"color": "#fff"
				}
			},
			mapNavigation: {
				enabled: false,
				enableDoubleClickZoomTo: false
			},
			exporting: {
				enabled: false
			},
			credits: {
				enabled: false
			},
			colorAxis: {
				min: 1,
				max: 200,
				type: 'logarithmic'
			},
			series: [{
				data:data,
				mapData: Highcharts.maps['cn/china'],
				joinBy: 'name',
				name: '立法数据量',
				states: {
					hover: {
						color: '#BADA55'
					}
				},
				tooltip: {
					valueSuffix: '/条'
				}
			}]
		});
	});
});