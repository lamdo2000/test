import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.enterShippingAddressAndContinueToPayment
import katalon.common.fillShippingAddressAndProceedToPayment
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link apple - Navigate to page category.png')

"Step 3: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on link byTitle.png')

"Step 4: Click on link byPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byPrice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link byPrice.png')

"Step 5: Click on button hotNewBestChoice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_hotNewBestChoice'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button hotNewBestChoice.png')

"Step 6: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_1Tb'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on label 1Tb.png')

"Step 7: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on label blueTitanium.png')

"Step 8: Click on link bestChoiceHotNewSale -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_bestChoiceHotNewSale'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on link bestChoiceHotNewSale - Navigate to page product.png')

"Step 9: Click on label 1Tb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_1Tb'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on label 1Tb.png')

"Step 10: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on label blueTitanium.png')

"Step 11: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on button buy2.png')

"Step 12: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on link goToCart.png')

"Step 13: Fill in shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Enter shipping address information and continue to payment"

enterShippingAddressAndContinueToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Complete Order for Best Choice Hot New Apple Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}