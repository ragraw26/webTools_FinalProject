var text;

$(document).ready(function(){

	$("#search").keyup(function(){
		debugger
		text = $(this).val();
	if(text.length > 0)
	{
		$.ajax(
			{
				type : "GET",
				data : "search=" + text,
				url : "search",
				datatype : "text",
				success : function(data) {
						debugger
						$("#searchArea").html(data);
				},
				error : function(xhr, ajaxOptions, thrownError) {
						
                        alert(xhr.status);
                        alert(thrownError);
						}
			});
	}
	else
	{
		$("#searchArea").html("");
	}
		return false;
	});
});