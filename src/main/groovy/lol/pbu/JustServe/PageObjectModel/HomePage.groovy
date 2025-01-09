package lol.pbu.JustServe.PageObjectModel

import geb.Page
import lol.pbu.JustServe.PageObjectModel.UserHeader.ProfileDropdownModule
import lol.pbu.JustServe.PageObjectModel.UserHeader.UserHeaderModule

class HomePage extends Page {
    static url = "https://www.justserve.org/"
    static content = {
        profileHeader { module(ProfileDropdownModule)}
        headerContent { module(UserHeaderModule)}
    }

}