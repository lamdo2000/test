import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link categoryChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categoryChekhlyNaIphone'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link categoryChekhlyNaIphone - Navigate to page category.png')

"Step 3: Click on link byTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byTitle'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link byTitle.png')

"Step 4: Click on link byPrice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_byPrice'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link byPrice.png')

"Step 5: Click on link wirelessChargingStand -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_wirelessChargingStand'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link wirelessChargingStand - Navigate to page product.png')

"Step 6: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button increased2.png')

"Step 7: Click on button increased2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increased2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button increased2.png')

"Step 8: Click on p price -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/p_price'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on p price - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Home After Selecting Wireless Charging Stand_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}