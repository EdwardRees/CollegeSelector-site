$("#calculation").html(
  "<div class='modal fade' id='calculationModal' tabindex='-1' role='dialog' aria-labelledby='calculate' aria-hidden='true'><div class='modal-dialog modal-lg' role='document'><div class='modal-content'><div class='modal-header'><h5 class='modal-title' id='calculationTitle'>Academic Calculator</h5><button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button></div><div class='modal-body'><div class='container-fluid'><div class='col-lg-12 text-center'><h4>Taking exams and applying to universities is difficult at the best of times, but waiting to learn if those applications are successful can be nerve wracking. You’re smart and just applied for a higher education – don’t stress; do the math!</h4><br /><br /></div><div class='row'><div class='form-inline row'><div class='form-group col-lg-6 text-center'><label for='college1' class='col-3 col-form-label'>College 1</label><div class='col-3'><input class='form-control' type='number' value='0.1' id='college1'></div></div><div class='form-group col-lg-6 text-center'><label for='college2' class='col-3 col-form-label'>College 2</label><div class='col-3'><input class='form-control' type='number' value='0.1' id='college2'></div></div><div class='form-group col-lg-6 text-center'><label for='college3' class='col-3 col-form-label'>College 3</label><div class='col-3'><input class='form-control' type='number' value='0.1' id='college3'></div></div><div class='form-group col-lg-6 text-center'><label for='college4' class='col-3 col-form-label'>College 4</label><div class='col-3'><input class='form-control' type='number' value='0.1' id='college4'></div></div><div class='col-lg-12 text-center my-auto'><br /><button href='#' id='calculate' type='submit' class='btn btn-primary'>Submit</button><br /></div><br /></div><div class='row my-auto'><div class='col-lg-12'><br /></div><div class='col-lg-4 text-center'><h3 id='probOfAll'><b>Probability of all occurring:</b><br /></h3></div><div class='col-lg-4 text-center'><h3 id='probOfNone'><b>Probability of none occurring:</b><br /></h3></div><div class='col-lg-4 text-center'><h3 id='probOfAtLeastOne'><b>Probability of at least one occurring:</b><br /></h3></div></div><div class='col-lg-12 text-center'><br /><h2>Notes</h2><ul class='text-left' style='font-size:18px'><li>This calculator takes the acceptance rates of four colleges and returns the probability of getting into all four, none of the four, and at least one of the four colleges.</li><li>Fill in the four probabilities between 0 and 1, where a published accceptance rate of 58% is 0.58.</li></ul></div></div></div><div class='modal-footer'><button class='btn btn-secondary' type='button' data-dismiss='modal'>Close</button></div></div></div></div></div>  "
);

$("#calculate").click(function() {
  var c1 = $("#college1").val();
  var c2 = $("#college2").val();
  var c3 = $("#college3").val();
  var c4 = $("#college4").val();
  var probOfAll =
    parseFloat(c1) * parseFloat(c2) * parseFloat(c3) * parseFloat(c4);
  $("#probOfAll").html(
    "<b>Probability of all occurring:</b><br />" +
      "≈" +
      Math.round(probOfAll * 100) +
      "%"
  );
  var probOfNone =
    parseFloat(1 - c1) *
    parseFloat(1 - c2) *
    parseFloat(1 - c3) *
    parseFloat(1 - c4);
  $("#probOfNone").html(
    "<b>Probability of none occurring:</b><br />" +
      "≈" +
      Math.round(probOfNone * 100) +
      "%"
  );
  $("#probOfAtLeastOne").html(
    "<b>Probability of at least one occurring:</b><br />" +
      "≈" +
      Math.round((1 - probOfNone) * 100) +
      "%"
  );
});
