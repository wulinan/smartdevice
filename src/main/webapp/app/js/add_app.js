/**
 * 
 */
$(document).ready(
		function(){
			$("#submit").on(
				"click",
				function(){
					var js_appName = "smartCAR";
					
					$.ajax({
					
						url : '/app/list_appinfo',
						data: {
							appName : js_appName
						},
						dataType : 'json',
						success : 
							function(data){
								console.log("app add success");
						    },
						error : 
							function(data){
								console.log("app add failed");
					    }
					});
				}
			)
		}
);