var NthTabs = function () {
    var nthTabs;

    var handleInit = function () {
        nthTabs = $("#editor-tabs").nthTabs();
    };

    var handleHome = function (src) {
        nthTabs.addTab({
            id: "home",
            title: "首页",
            content: '<iframe name="iframe0" width="100%" height="737" src="' + src + '" frameborder="0"></iframe>',
            allowClose: false,
            active: true
        });
    };

    var handleAddTab = function (id, title, src) {
        // 判断选项卡是否存在
        var hasTab = false;
        var nthTabList = nthTabs.getTabList();
        for (var i = 0 ; i < nthTabList.length ; i++) {
            var nthTab = nthTabList[i];
            if (nthTab.id == "#" + id) {
                nthTabs.setActTab(id);
                hasTab = true;
                break;
            }
        }

        // 选项卡已存在，返回
        if (hasTab) {
            return;
        }

        nthTabs.addTab({
            id: id,
            title: title,
            content: '<iframe name="iframe' + id + '" width="100%" height="737" src="' + src + '" frameborder="0"></iframe>'
        });
        nthTabs.setActTab(id);
    };

    return {
        init: function () {
            handleInit();
        },

        home: function (src) {
            handleHome(src)
        },

        addTab: function (id, title, src, allowClose, active) {
            handleAddTab(id, title, src, allowClose, active);
        }
    };
}();

jQuery(document).ready(function () {
   NthTabs.init();
});