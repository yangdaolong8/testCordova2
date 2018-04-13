cordova.define("cordova-plugin-call.call", function(require, exports, module) {
var exec = require('cordova/exec');
module.exports ={
callPhone:function (content) {
     exec(null, null, "Calls", "callPhone", content);
}
};
});