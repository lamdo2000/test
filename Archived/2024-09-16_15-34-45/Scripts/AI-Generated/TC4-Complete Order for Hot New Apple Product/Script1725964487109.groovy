import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.fillShippingAddressAndProceedToPayment
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link categoryApple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categoryApple'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link categoryApple - Navigate to page category.png')

"Step 3: Click on link hotNew -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_hotNew'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link hotNew - Navigate to page product.png')

"Step 4: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_256Gb'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on label 256Gb.png')

"Step 5: Click on label yellow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_yellow'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on label yellow.png')

"Step 6: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button buy2.png')

"Step 7: Click on link placeAnOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link placeAnOrder - Navigate to page cart.png')

"Step 8: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button proceedToCheckout.png')

"Step 9: Fill in shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Fill in shipping address details and proceed to payment"

fillShippingAddressAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on button completeOrder -> Navigate to page 'thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on button completeOrder - Navigate to page thank-you.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Order for Hot New Apple Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}