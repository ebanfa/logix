<!DOCTYPE html>
<%
	String contextPath = getServletContext().getContextPath();
%>
<html lang="en">
<!--[if IE 9 ]><html class="ie9"><![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Material Admin</title>
        
        <!-- Vendor CSS -->
        <link href="vendors/bower_components/animate.css/animate.min.css" rel="stylesheet">
        <link href="vendors/bower_components/bootstrap-sweetalert/lib/sweet-alert.css" rel="stylesheet">
        <link href="vendors/bower_components/material-design-iconic-font/dist/css/material-design-iconic-font.min.css" rel="stylesheet">
                
        <link href="vendors/bower_components/bootstrap-select/dist/css/bootstrap-select.css" rel="stylesheet">
        <link href="vendors/bower_components/nouislider/distribute/jquery.nouislider.min.css" rel="stylesheet">
        <link href="vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
        <link href="vendors/farbtastic/farbtastic.css" rel="stylesheet">
        <link href="vendors/bower_components/chosen/chosen.min.css" rel="stylesheet">
        <link href="vendors/summernote/dist/summernote.css" rel="stylesheet">
        <link href="vendors/bootgrid/jquery.bootgrid.min.css" rel="stylesheet">
            
        <!-- CSS -->
        <link href="css/app.min.1.css" rel="stylesheet">
        <link href="css/app.min.2.css" rel="stylesheet">
        
		<script type="text/javascript">
			erraiJaxRsApplicationRoot = "rest";
			erraiSystemLoghandlerLevel = "INFO";
		</script>
		
		<script type="text/javascript" src="<%=contextPath%>/app/app.nocache.js"></script>
    </head>

	<body>
	<div id="rootPanel"></div>

	<iframe src="javascript:''" id="__gwt_historyFrame" style="width: 0; height: 0; border: 0"></iframe>
	   <!-- Javascript Libraries -->
        <script src="vendors/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        
        <script src="vendors/bower_components/flot/jquery.flot.js"></script>
        <script src="vendors/bower_components/flot/jquery.flot.resize.js"></script>
        <script src="vendors/bower_components/flot.curvedlines/curvedLines.js"></script>
        <script src="vendors/sparklines/jquery.sparkline.min.js"></script>
        <script src="vendors/bower_components/jquery.easy-pie-chart/dist/jquery.easypiechart.min.js"></script>
        
        <script src="vendors/bower_components/moment/min/moment.min.js"></script>
        <script src="vendors/bower_components/fullcalendar/dist/fullcalendar.min.js"></script>
        <script src="vendors/bower_components/simpleWeather/jquery.simpleWeather.min.js"></script>
        <script src="vendors/bower_components/Waves/dist/waves.min.js"></script>
        <script src="vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
        <script src="vendors/bower_components/bootstrap-sweetalert/lib/sweet-alert.min.js"></script>
        <script src="vendors/bower_components/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
        
         <script src="vendors/bower_components/moment/min/moment.min.js"></script>
        <script src="vendors/bower_components/bootstrap-select/dist/js/bootstrap-select.js"></script>
        <script src="vendors/bower_components/nouislider/distribute/jquery.nouislider.all.min.js"></script>
        <script src="vendors/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
        <script src="vendors/bower_components/typeahead.js/dist/typeahead.bundle.min.js"></script>
        <script src="vendors/summernote/dist/summernote-updated.min.js"></script>
        
        
        <!-- Placeholder for IE9 -->
        <!--[if IE 9 ]>
            <script src="vendors/bower_components/jquery-placeholder/jquery.placeholder.min.js"></script>
        <![endif]-->
        
        <script src="js/flot-charts/curved-line-chart.js"></script>
        <script src="js/flot-charts/line-chart.js"></script>
        <script src="js/charts.js"></script>
        
        <script src="js/charts.js"></script>
        <script src="js/functions.js"></script>
        <script src="js/demo.js"></script>
	</body>
</html>
