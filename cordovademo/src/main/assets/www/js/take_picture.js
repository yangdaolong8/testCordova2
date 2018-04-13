var app = {
   initialize: function() {
      document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
   },
   onDeviceReady: function() {
      this.receivedEvent();
   },
   $$: function(id) {
      return document.getElementById(id);
   },
   receivedEvent: function() {
      var getDomLabrary = this.$$('openLabrary');
      var _this = this;
      getDomLabrary.onclick = function() {
         // 打开图片库
         navigator.camera.getPicture(onSuccess, onFail, {
            quality: 50,                                            // 相片质量是50
            sourceType: Camera.PictureSourceType.Camera,            // 设置从摄像头拍照获取
            destinationType: Camera.DestinationType.FILE_URI        // 以文件路径返回
         });

         function onSuccess(imageURI) {
             console.log(imageURI)
             _this.$$('myImage').src = imageURI;
             _this.$$('text').innerHTML = imageURI.substr(imageURI.lastIndexOf('/')+1);
         }

         function onFail(message) {
            alert('Failed because: ' + message);
         }
      }
   }
};

app.initialize();