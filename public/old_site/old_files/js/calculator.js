$("#calculate").click(function(){
    var c1 = $("#college1").val();
    var c2 = $("#college2").val();
    var c3 = $("#college3").val();
    var c4 = $("#college4").val();
    var probOfAll = parseFloat(c1) * parseFloat(c2) * parseFloat(c3) * parseFloat(c4)
    $("#probOfAll").html("<b>Probability of all occurring:</b><br />" + "≈" + Math.round(probOfAll * 100) + "%")
    var probOfNone = parseFloat(1 - c1) * parseFloat(1 - c2) * parseFloat(1 - c3) * parseFloat(1 - c4)
    $("#probOfNone").html("<b>Probability of none occurring:</b><br />" + "≈" + Math.round(probOfNone * 100) + "%")
    $("#probOfAtLeastOne").html("<b>Probability of at least one occurring:</b><br />" + "≈" + Math.round((1-probOfNone) * 100) + "%")
})