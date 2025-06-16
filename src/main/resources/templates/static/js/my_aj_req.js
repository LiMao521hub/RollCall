function aj_req(call_func, sig, url, data_dict = {}, async = true, type = "POST", dataType = "text") {
    $.ajax({
        url: url, type: type, data: data_dict, async: async, dataType: dataType, success: function (data) {
            if ($.trim(data) === "") {
                call_func($.trim(data), sig)
            } else {
                call_func(JSON.parse(data), sig)
            }
        }, error: function () {
            window.alert("请求异常!")
        }
    });
}



