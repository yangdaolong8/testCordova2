var app = {
    // Application Constructor
    initialize: function() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
    },
    // deviceready Event Handler
    onDeviceReady: function() {
        this.receivedEvent();
    },
    $$: function(id) {
        return document.getElementById(id);
    },
    receivedEvent: function(){
        var _this = this;
        var getDomLabrary = this.$$('openLabrary');
        getDomLabrary.onclick = function(){
            // 打开图片库
            navigator.camera.getPicture(onSuccess, onFail, {
                quality: 50,                                       // 相片质量是50
                sourceType : Camera.PictureSourceType.SAVEDPHOTOALBUM, // 设置从图片库获取
                destinationType: Camera.DestinationType.DATA_URL       // 以base64返回
            });
            function onSuccess(imageData) {
                console.log(imageData)
                _this.$$('myImage').src = "data:image/jpeg;base64," + imageData;
            }
            function onFail(message) {
                alert('Failed because: ' + message);
            }
        }
    }
};

app.initialize();