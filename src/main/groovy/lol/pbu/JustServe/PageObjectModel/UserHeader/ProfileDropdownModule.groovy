package lol.pbu.JustServe.PageObjectModel.UserHeader
import geb.Module

class ProfileDropdownModule extends Module {
    static content = {
        myDashboardButton { $("a",text: 'My Dashboard') }
        administrationButton { $("a", text: 'Administration') }
        addProjectButton { $("a", text: 'Add Project') }
        editProfileButton { $("a", text: 'Edit Profile') }
        helpCenterButton { $("a", text: 'Help Center') }
        blogButton { $("a", text: 'Blog') }
        signOutButton { $("a", text: 'SignOut') }
    }

    void clickMyDashboardButton() {
        myDashboardButton.click()
    }
    void clickAdministrationButton() {
        administrationButton.click()
    }
    void clickAddProjectButton() {
        addProjectButton.click()
    }
    void clickEditProfileButton() {
        editProfileButton.click()
    }
    void clickHelpCenterButton() {
        helpCenterButton.click()
    }
    void clickBlogButton() {
        blogButton.click()
    }
    void clickSignOutButton() {
        signOutButton.click()
    }

}
