import Addition from './addition';

//var addUtil = require('./addition');
"use strict";
function calculateSum() {
  let left = document.getElementById("param1").innerHTML;
  let right = document.getElementById("param2").innerHTML;
  let additionUtils = new Addition(parseInt(left,8), parseInt(right,8));
//  let result = addUtil.add(parseInt(left,8), parseInt(right,8));
    let result = additionUtils.add();
  var elm = document.getElementById("result");  // One element
  elm.innerHTML = result;
}
//let add = (x,y) => (x+y);
function init() {
  document.getElementById("btn1").onclick = calculateSum;
}

window.onload = init;

