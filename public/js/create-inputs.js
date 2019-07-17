function create(){
    quantity = $("#quantity").val()
    quantity = parseInt(quantity)
    inputs = []
    for(var i = 1; i<quantity+1; i++){
        var idName = "college" + i
        inputs += ("<div class='form-group col-lg-6'><label for='college" + i + "' class='col-6 col-form-label'>College " + i + "</label>\n<div class='col-6'><input class='form-control' step='0.1' type='number' value='0.1' id='" +idName + "'></div></div>")
        
    }
    $("#inputs").html(inputs)
}

create()

