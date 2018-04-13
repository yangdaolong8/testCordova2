cordova.define("cordova-plugin-toast.toast", function(require, exports, module) {
var exec = require('cordova/exec');
module.exports ={
showToast:function (content,type) {
     exec(null, null, "Toasts", "showToast", [content,type]);
}
};
});