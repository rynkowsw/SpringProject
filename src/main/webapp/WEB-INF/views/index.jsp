<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html lang="en" ng-app="myApp">
<head>
<meta charset="utf-8">
<title>GYM</title>
<script src="<c:url value="/bower_components/angular/angular.js" />"></script>
<script src="<c:url value="/bower_components/angular-animate/angular-animate.js" />"></script>
<script src="<c:url value="/bower_components/angular-route/angular-route.js" />"></script>
<script src="<c:url value="/bower_components/angular-resource/angular-resource.js" />"></script>

<!-- CSS -->
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" /> "media="screen">
<link rel="stylesheet" href="<c:url value="/css/animations.css" />">
<link rel="stylesheet" href="<c:url value="/css/calendar.min.css" />">
<link rel="stylesheet" href="<c:url value="/css/icomoon.min.css" />">
<link rel="stylesheet" href="<c:url value="/css/media-player.min.css" />">
<link rel="stylesheet" href="<c:url value="/css/file-manager.min.css" />">
<link rel="stylesheet" href="<c:url value="/css/form.min.css" />">
<link rel="stylesheet" href="<c:url value="/css/style.min.css" />">
</head>


<body>

	<ng-include src="'html/header.html'"></ng-include>
	
	<section id="main" role="main" ng-controller="index">		
			<!-- Left Sidebar -->
			
			<aside id="leftbar" class="pull-left">
				<div class="sidebar-container">
					<ul class="side-menu shadowed">
						<li><a class="active" href="" ng-click="showMain = 'main'"><i
								class="icon-home"></i>Main dashboard</a></li>
			
						<li class="submenu">
							<a href=""> <i class="icon-cog"></i>Body Measurement</a>
							<ul>
								<li>	<a href="" ng-click="showMain = 'bodyMeasurement'">Body fat/water/muscles/weight</a></li>
								<li>	<a href="">Fitness progress</a>	</li>
							</ul>
						</li>
						<li class="submenu"><a href="">
							<i class="icon-table-2"></i>Plan</a>
							<ul>
								<li><a href="" ng-click="showMain = 'myTraining'">My training</a></li>
								<li><a href="" ng-click="showMain = 'addTraining'">Add training</a></li>
								<li><a href="" ng-click="showMain = 'addExercise'">Add exercise</a></li>
							</ul>
						</li>
						<li class="submenu"><a href=""><i class="icon-copy-2"></i>Complete a workout</a>
							<ul>
								<li><a href="">Strength Training</a></li>
								<li><a href="">Running</a></li>
								<li><a href="">Swimming</a></li>
			
							</ul>
						</li>
						<li class="submenu"><a href=""><i class="icon-glass"></i>Diet</a>
							<ul>
								<li><a href="" ng-click="showMain = 'postMeal'">Post a meal</a></li>
								<li><a href="" ng-click="showMain = 'currentDiet'">Current diet</a></li>
								<li><a href="" ng-click="showMain = 'addProduct'">Add product to base</a></li>
							</ul>
						</li>
						<li><a href="" ng-click="showMain = 'fileManager'"><i class="icon-folder"></i>File Manager</a></li>
						<li><a href="" ng-click="showMain = 'calendar'"><i class="icon-calendar"></i>Calendar</a></li>
						<li class="submenu"><a href="" ><i class="icon-camera"></i>Gallery</a>
							
							<ul>
								<li><a href="" ng-click="showMain = 'gallery'">Photo</a></li>
								<li><a href="" ng-click="showMain = 'video'">Movie</a></li>
			
							</ul>
						
						</li>
			
					</ul>
				</div>
				<span id="leftbar-toggle" class="visible-xs sidebar-toggle"> 
						<i class="icon-angle-right"></i>
				</span>
			</aside>
			
			<!-- Right Sidebar -->
               <aside id="rightbar" class="pull-right">
                    <div class="sidebar-container">
                         <!-- Date + Clock -->
                         <div class="clock shadowed">
                              <div id="date"></div>
                              <div id="time">
                                   <span id="hours"></span>
                                   :
                                   <span id="min"></span>
                                   :
                                   <span id="sec"></span>
                              </div>
                         </div>
                         
                         <!-- Calendar -->
                         <div class="shadowed side-calendar">
                              <div id="sidebar-calendar"></div>
                         </div>
                         
                         
                    </div>
                    
                    <span id="rightbar-toggle" class="hidden-lg sidebar-toggle">
                         <i class="icon-angle-left"></i>
                    </span>
               </aside>
			<!-- Gallery -->
			<ng-include src="'html/gallery.html'"></ng-include>
			
			<!-- Gallery Video -->
			<ng-include src="'html/video.html'"></ng-include>
			
			<!-- Measurement body -->
			<ng-include src="'html/measurement.html'" ng-show="showMain == 'bodyMeasurement'"></ng-include>
			
			<!-- Add exercise -->
			<ng-include src="'html/addExersise.html'"  ng-show="showMain == 'addExercise'"></ng-include>

			<!-- Calendar -->
			<ng-include src="'html/calendar.html'"    ng-show="showMain == 'calendar'"></ng-include>
			
			<!-- Add Training -->
			<ng-include src="'html/addTraining.html'" ng-show="showMain == 'addTraining'"  ></ng-include>

			<!-- My Training -->
			<ng-include src="'html/myTraining.html'"  ng-show="showMain == 'myTraining'"></ng-include>

			<!-- Content -->
			<ng-include src="'html/mainPage.html'" ng-show="showMain == 'main'"></ng-include>
	</section>
	
	<footer id="footer">
		<p style="text-align: center">Copyright (c) 2014-2015, Rynkowski
			fitness organizer. All rights reserved.</p>
	</footer>

</body>


<!-- Javascipt -->
<script src="<c:url value="/jsGui/jquery-1.10.2.min.js" />"></script>
<script src="<c:url value="/jsGui/jquery-ui-1.10.3.min.js" />"></script>
<script src="<c:url value="/jsGui/chart/highcharts.js" />"></script>
<script src="<c:url value="/jsGui/chart/modules/exporting.js" />"></script>
<script src="<c:url value="/jsGui/bootstrap.min.js" />"></script>
<script src="<c:url value="/jsGui/datetimepicker.min.js" />"></script>
<script src="<c:url value="/jsGui/feeds.js" />"></script>
<script src="<c:url value="/jsGui/chosen.js" />"></script>
<script src="<c:url value="/jsGui/shadowbox.js" />"></script>
<script src="<c:url value="/jsGui/calendar.min.js" />"></script>
<script src="<c:url value="/jsGui/sparkline.min.js" />"></script>
<script src="<c:url value="/jsGui/masonry.min.js" />"></script>
<script src="<c:url value="/jsGui/enscroll.min.js" />"></script>
<script src="<c:url value="/jsGui/datatables.min.js" />"></script>
<script src="<c:url value="/jsGui/autosize.min.js" />"></script>
<script src="<c:url value="/jsGui/select.min.js" />"></script>
<script src="<c:url value="/jsGui/toggler.min.js" />"></script>
<script src="<c:url value="/jsGui/colorpicker.min.js" />"></script>
<script src="<c:url value="/jsGui/fileupload.min.js" />"></script>
<script src="<c:url value="/jsGui/media-player.js" />"></script>
<script src="<c:url value="/jsGui/validation/validate.min.js" />"></script>
<script src="<c:url value="/jsGui/validation/validationEngine.min.js" />"></script>
<script src="<c:url value="/jsGui/file-manager/elfinder.min.js" />"></script>
<script src="<c:url value="/jsGui/functions.js" />"></script>
<script src="<c:url value="/js/controllers.js" />"></script>

</html>
