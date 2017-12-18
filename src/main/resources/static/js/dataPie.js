$(function() {
	Highcharts.chart('pie', {
		chart: {
			plotBackgroundColor: null,
			plotBorderWidth: null,
			plotShadow: false,
			type: 'pie',
			backgroundColor: 'rgba(0,0,0,0.25)',
			height: 280,
			width: 280
		},
		exporting: {
			enabled: false
		},
		credits: {
			enabled: false
		},
		title: {
			text: '不知名',
			style: {
				"color": "rgb(255,255,255)"
			}
		},
		tooltip: {
			pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>',
			
		},
		plotOptions: {
			pie: {
				allowPointSelect: true,
				cursor: 'pointer',
				dataLabels: {
					enabled: true,
					format: '<b>{point.name}</b>',
					style: {
						color:"#ffffff"
					}
				}
			}
		},
		series: [{
			name: '占有比列',
			colorByPoint: true,
			data: [{
				name: '类别一',
				y: 56.33
			}, {
				name: '类别二',
				y: 24.03,
			}, {
				name: '类别三',
				y: 10.38
			}, {
				name: '类别四',
				y: 4.77
			}, {
				name: '类别五',
				y: 0.91
			}, {
				name: '类别六',
				y: 0.2
			}]
		}]
	});
});