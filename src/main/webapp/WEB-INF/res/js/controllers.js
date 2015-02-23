'use strict';
// Site Impressions

/* Controllers */
var app = angular.module("myApp", [ 'ngResource' ]);

app.controller("index", function($scope) {
	$scope.showMain = 'main';
});

app.controller("addExercise", function($scope, $http) {

	addExercise = [ {
		excerciseId : 1,
		name : "",
		description : "",
		repeats : 1,
		series : 1,
		time : 0,
		trainings : [ 0 ]
	} ];

	$scope.saveExercise = function() {
		console.log(addExercise, 'send date');
		$http.post('http://localhost:8080/inz/addExcercis', addExercise)
				.success(function(data, status, headers, config) {

				}).error(function(data, status, headers, config) {

				});
	};
});

app.controller("addTrainingCtrl", function($scope, $http) {
	$scope.training = [];
	$scope.exercises = [];

	$http.get("http://localhost:8080/inz/getExcercis").success(
			function(response) {
				$scope.exercises = response;
				console.log(response);
			});

	var url = "http://localhost:8080/inz/savec";
	$http.post(url, '{"name":"sdsd","employees":23,"headoffice":"asdede"}')
			.success(function(response) {
				$scope.exercises = response;
				console.log(response);
			});

	$scope.remove = function(item) {
		var i;
		i = $scope.training.indexOf(item);
		$scope.training.splice(i, 1);
	};

	$scope.addTraining = function() {
		$scope.training.push({
			trainingText : $scope.trainingText,
			series : $scope.series,
			repeat : $scope.repeat
		});
		$scope.trainingText = '';
		$scope.series = '1';
		$scope.repeat = '1';
	};

});

app.controller("myTrainingCtrl", function($scope) {
	$scope.training = [ {
		exerciseText : 'Siła'
	}, {
		exerciseText : 'klata na ławce'
	}, {
		exerciseText : 'barki stojac'
	} ];
	$scope.training1 = 'ss';
	$scope.removeTraining = function(item) {
		var i;
		i = $scope.training.indexOf(item);
		$scope.training.splice(i, 1);
	};

});

app.controller("calendar", function($scope) {
	$(document).ready(
			function() {
				$('#calendar').fullCalendar(
						{
							header : {
								center : '',
								left : 'title',
								right : 'prev,today next'
							},

							selectable : true,
							selectHelper : true,
							editable : true,

							// On Day Select

							select : function(start, end, allDay) {
								$('#addNew-event').modal('show');
								$('#getStart').val(start);
								$('#getEnd').val(end);
							},

							eventResize : function(event, dayDelta,
									minuteDelta, revertFunc) {
								$('#editEvent').modal('show');

								var info = "The end date of " + event.title
										+ "has been moved " + dayDelta
										+ " days and " + minuteDelta
										+ " minutes.";

								$('#eventInfo').html(info);

								$('#editEvent #editCancel').click(function() {
									revertFunc();
								})
							}
						});

				$('body').on(
						'click',
						'#addEvent',
						function() {
							var eventForm = $(this).closest('.modal').find(
									'.form-validation');
							eventForm.validationEngine('validate');

							if (!(eventForm).find('.formErrorContent')[0]) {

								// Event Name
								var eventName = $('#eventName').val();

								// Render Event
								$('#calendar').fullCalendar('renderEvent', {
									title : eventName,
									start : $('#getStart').val(),
									end : $('#getEnd').val(),
									allDay : true,
								}, true); // Stick the event

								$('#addNew-event form')[0].reset()
								$('#addNew-event').modal('hide');
							}
						});
			});

	// Calendar views
	$('body').on('click', '.calendar-actions span', function() {
		var dataView = $(this).attr('data-view');
		$('#calendar').fullCalendar('changeView', dataView);
	});

});
