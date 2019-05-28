function getProbabilities() {
  quantity = $("#quantity").val();
  quantity = parseInt(quantity);
  probabilities = [];
  for (var i = 1; i < quantity + 1; i++) {
    var idName = "#college" + i;
    probabilities.push(parseFloat($(idName).val()));
  }
  return probabilities;
}

function calculateProbabilities() {
  listOfProbabilities = getProbabilities();
  function calcAll() {
    let l = listOfProbabilities;
    var all = 1;
    for (var i = 0; i < l.length; i++) {
      all *= l[i];
    }
    return Math.round(all * 100) / 100;
  }

  function calcNone() {
    let l = listOfProbabilities;
    var none = 1;
    for (var i = 0; i < l.length; i++) {
      none *= 1 - l[i];
    }
    return Math.round(none * 100) / 100;
  }

  function calcAtLeastOne() {
    return Math.round((1 - calcNone()) * 100) / 100;
  }

  $("#probOfAll").html(
    "<b>Probability of all occurring:</b><br />" +
      "≈" +
      Math.round(calcAll() * 100) +
      "%"
  );
  $("#probOfNone").html(
    "<b>Probability of none occurring:</b><br />" +
      "≈" +
      Math.round(calcNone() * 100) +
      "%"
  );
  $("#probOfAtLeastOne").html(
    "<b>Probability of at least one occurring:</b><br />" +
      "≈" +
      Math.round(calcAtLeastOne() * 100) +
      "%"
  );
}
