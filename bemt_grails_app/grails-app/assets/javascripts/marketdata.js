/*
 * BEMT Market Data Component Javascript
 * Version 1.0
 * 
 * marketdata.js
 * module for marketdata page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Marketdata = Marketdata || {};

Marketdata = function() {

  //private properties

  //private methods
	var _initializeEventBindings = function() {

		$(document).on('bemt.resetmarketsearch', function(evt) {
			_clearSearch();
		});

		$(document).on('bemt.showmarketdetail', function(evt, id) {
			if($("#row_"+id+" .toggle").hasClass('fa-plus-square')) {
				$("#row_"+id+" .toggle").removeClass('fa-plus-square').addClass('fa-minus-square');
			} else {
				$("#row_"+id+" .toggle").removeClass('fa-minus-square').addClass('fa-plus-square');
			}
			$("#row_"+id+" .toggle")
			$("#detailrow_"+id).toggle();
			$("#detailrow_"+id+" .tabs-content .content").each(function() {
				$(document).trigger('bemt.loadsurveydeatil',[$(this)]);
			});
		}); 

		$(document).on('bemt.copydone', function(evt) {
			$('#md-modal-window').foundation('reveal', 'close');
			//only clear error messages, the rest are set to hide after delay
			BEMT.clearErrorMessages();
		});

		$(document).on('bemt.copy', function(evt) {
			//empty the div
			$("#md-modal-window").empty();
			//get the url to load
			var url = $(evt.target).attr("bemt-route");
			$('#md-modal-window').load(url, function() {
				$('#md-modal-window').foundation('reveal', 'open');
			});
		});

		$(document).on('bemt.loadsurveydeatil', function(evt, n) {
			var url = $(n).attr("bemt-load");
			if ($(n).find(".md-load-widget").length == 1) {
				$(n).load(url);				
			} else {
				//no need to load or reload.
			}
		}); 
	}

	var _drawCharts = function(id) {
		//for those with total of 106
		var options106 = {
			labelDirection: 'explode',
	    labelOffset: 70,
	    chartPadding: 35,		
			labelInterpolationFnc: function(value) {
    		return Math.round(value / 106 * 100) + '%';
  		}		
  	};		

		var options100 = {
			labelDirection: 'explode',
	    labelOffset: 70,
	    chartPadding: 35,		
			labelInterpolationFnc: function(value) {
    		return value + '%';
  		}		
  	};

		if(id == 1) {
			var data1 = {
				series: [
					{data: 73, className: 'bemt-chart-1'}, 
					{data: 6, className: 'bemt-chart-2'},
					{data: 13, className: 'bemt-chart-3'},
					{data: 6, className: 'bemt-chart-4'},
					{data: 8, className: 'bemt-chart-5'}
				]
			};
			new Chartist.Pie('#chart1', data1, options106);

			var data2 = {
				series: [
					{data: 69, className: 'bemt-chart-1'}, 
					{data: 9, className: 'bemt-chart-2'},
					{data: 13, className: 'bemt-chart-3'},
					{data: 15, className: 'bemt-chart-4'},
				]
			};		
			new Chartist.Pie('#chart2', data2, options106);

			var data3 = {
				series: [
					{data: 76, className: 'bemt-chart-1'}, 
					{data: 30, className: 'bemt-chart-2'}
				]
			};
			new Chartist.Pie('#chart3', data3, options106);
		} else if (id == 2) {
			var data4 = {
				series: [
					{data: 51.8, className: 'bemt-chart-1'}, 
					{data: 35.4, className: 'bemt-chart-2'},
					{data: 10.4, className: 'bemt-chart-3'},
					{data: 2.4, className: 'bemt-chart-4'}
				]
			};
			new Chartist.Pie('#chart4', data4, options100);

			var data5 = {
				series: [
					{data: 58.7, className: 'bemt-chart-1'}, 
					{data: 14.9, className: 'bemt-chart-2'},
					{data: 5.0, className: 'bemt-chart-3'},
					{data: 4.3, className: 'bemt-chart-4'},
					{data: 4.1, className: 'bemt-chart-5'},
					{data: 12.0, className: 'bemt-chart-6'}
				]
			};
			new Chartist.Pie('#chart5', data5, options100);			

			var data6 = {
				series: [
					{data: 26, className: 'bemt-chart-1'}, 
					{data: 23, className: 'bemt-chart-2'},
					{data: 17, className: 'bemt-chart-3'},
					{data: 10, className: 'bemt-chart-4'},
					{data: 10, className: 'bemt-chart-5'},
					{data: 14, className: 'bemt-chart-6'}
				]
			};
			new Chartist.Pie('#chart6', data6, options100);				
		} else {

			var data7 = {
				series: [
					{data: 39.9, className: 'bemt-chart-1'}, 
					{data: 23.4, className: 'bemt-chart-2'},
					{data: 19.8, className: 'bemt-chart-3'},
					{data: 6.8, className: 'bemt-chart-4'},
					{data: 4.6, className: 'bemt-chart-5'},
					{data: 5.5, className: 'bemt-chart-6'}
				]
			};
			new Chartist.Pie('#chart7', data7, options100);					

			var data8 = {
				series: [
					{data: 45, className: 'bemt-chart-1'}, 
					{data: 29, className: 'bemt-chart-2'},
					{data: 14, className: 'bemt-chart-3'},
					{data: 8, className: 'bemt-chart-4'},
					{data: 7, className: 'bemt-chart-5'},
					{data: 3, className: 'bemt-chart-6'}
				]
			};
			new Chartist.Pie('#chart8', data8, options100);					


			var data9 = {
				series: [
					{data: 32.7, className: 'bemt-chart-1'}, 
					{data: 22.3, className: 'bemt-chart-2'},
					{data: 16.2, className: 'bemt-chart-3'},
					{data: 11.9, className: 'bemt-chart-4'},
					{data: 7.8, className: 'bemt-chart-5'},
					{data: 9.1, className: 'bemt-chart-6'}
				]
			};
			new Chartist.Pie('#chart9', data9, options100);		
		}
	}

  //public methods

  var _clearSearch = function() {
	  $("#search-results").empty();	
  }

  var showResults = function(data) {
  	_clearSearch();
  	$("#search-results").html(data);
  	$(document).foundation();
  }

	var doSearch = function() {		
		$("#search-content").hide();
		$("#search-results").show();
	};  

	var resetSearch = function() {		
		$("#search-results").empty(); 
	};  

	var showChartList = function(id) {
		$(".chart_list:visible").fadeOut(400, function() {
			$("#chart_list"+id).fadeIn(400, function() {
				_drawCharts(id);
			});
		});
		$("#chart_nav dd").removeClass("active");
		$("#chart_nav"+id).addClass("active");
	}

	var initPage = function() {		
		_initializeEventBindings();
		//_drawCharts(1);
	};  

	var initCharts = function() {		
		_drawCharts(1);
	};  	

  //make module methods public  
  var oPublic = {
  	initPage : initPage,
  	initCharts : initCharts,
  	doSearch : doSearch,
  	showResults : showResults, 
  	resetSearch : resetSearch,
  	showChartList : showChartList  
  };

  return oPublic;
}();