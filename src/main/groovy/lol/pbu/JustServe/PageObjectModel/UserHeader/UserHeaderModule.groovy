package lol.pbu.JustServe.PageObjectModel.UserHeader

import geb.Module

class UserHeaderModule extends Module {
    static content = {
        justServeLogoButton { $("img", class: 'js-logo') }
        desktopUserNameDropDown { $("button", class: 'userNameBtn') }
        languageIconButton { $("button", class: 'languageBtn') }
    }
}
