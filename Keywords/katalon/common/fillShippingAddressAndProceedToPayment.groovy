package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingAddressAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button proceedToCheckout -> Navigate to page 'checkout/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 2: Click on input shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'))
        
        "Step 3: Enter input value in input shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'), data['input_shippingAddressFirstName'])
        
        "Step 4: Click on input shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'))
        
        "Step 5: Enter input value in input shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'), data['input_shippingAddressLastName'])
        
        "Step 6: Click on input shippingAddressAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'))
        
        "Step 7: Enter input value in input shippingAddressAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'), data['input_shippingAddressAddressLine1'])
        
        "Step 8: Click on input shippingAddressZip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'))
        
        "Step 9: Enter input value in input shippingAddressZip"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'), data['input_shippingAddressZip'])
        
        "Step 10: Click on input shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'))
        
        "Step 11: Enter input value in input shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'), data['input_shippingAddressCity'])
        
        "Step 12: Click on input shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'))
        
        "Step 13: Enter input value in input shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'), data['input_shippingAddressState'])
        
        "Step 14: Click on input shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'))
        
        "Step 15: Enter input value in input shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'), data['input_shippingAddressPhone'])
        
        "Step 16: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToPayment'))
        
        "Step 17: Click on input shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'))
        
        "Step 18: Enter input value in input shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'), data['input_shippingAddressFirstName'])
        
        "Step 19: Click on input shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'))
        
        "Step 20: Enter input value in input shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'), data['input_shippingAddressLastName'])
        
        "Step 21: Click on input shippingAddressAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'))
        
        "Step 22: Enter input value in input shippingAddressAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'), data['input_shippingAddressAddressLine1'])
        
        "Step 23: Click on input shippingAddressZip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'))
        
        "Step 24: Enter input value in input shippingAddressZip"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'), data['input_shippingAddressZip'])
        
        "Step 25: Click on input shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'))
        
        "Step 26: Enter input value in input shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'), data['input_shippingAddressCity'])
        
        "Step 27: Click on input shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'))
        
        "Step 28: Enter input value in input shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'), data['input_shippingAddressState'])
        
        "Step 29: Click on input shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'))
        
        "Step 30: Enter input value in input shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'), data['input_shippingAddressPhone'])
        
        "Step 31: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_shippingAddressAddressLine1'] = testData.getValue('input_shippingAddressAddressLine1', rowIndex)
        data['input_shippingAddressAddressLine1_1'] = testData.getValue('input_shippingAddressAddressLine1_1', rowIndex)
        data['input_shippingAddressCity'] = testData.getValue('input_shippingAddressCity', rowIndex)
        data['input_shippingAddressCity_1'] = testData.getValue('input_shippingAddressCity_1', rowIndex)
        data['input_shippingAddressFirstName'] = testData.getValue('input_shippingAddressFirstName', rowIndex)
        data['input_shippingAddressFirstName_1'] = testData.getValue('input_shippingAddressFirstName_1', rowIndex)
        data['input_shippingAddressLastName'] = testData.getValue('input_shippingAddressLastName', rowIndex)
        data['input_shippingAddressLastName_1'] = testData.getValue('input_shippingAddressLastName_1', rowIndex)
        data['input_shippingAddressPhone'] = testData.getValue('input_shippingAddressPhone', rowIndex)
        data['input_shippingAddressPhone_1'] = testData.getValue('input_shippingAddressPhone_1', rowIndex)
        data['input_shippingAddressState'] = testData.getValue('input_shippingAddressState', rowIndex)
        data['input_shippingAddressState_1'] = testData.getValue('input_shippingAddressState_1', rowIndex)
        data['input_shippingAddressZip'] = testData.getValue('input_shippingAddressZip', rowIndex)
        data['input_shippingAddressZip_1'] = testData.getValue('input_shippingAddressZip_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_shippingAddressAddressLine1'] = 'default_data'
        data['input_shippingAddressAddressLine1_1'] = 'default_data'
        data['input_shippingAddressCity'] = 'default_data'
        data['input_shippingAddressCity_1'] = 'default_data'
        data['input_shippingAddressFirstName'] = 'default_data'
        data['input_shippingAddressFirstName_1'] = 'default_data'
        data['input_shippingAddressLastName'] = 'default_data'
        data['input_shippingAddressLastName_1'] = 'default_data'
        data['input_shippingAddressPhone'] = 'default_data'
        data['input_shippingAddressPhone_1'] = 'default_data'
        data['input_shippingAddressState'] = 'default_data'
        data['input_shippingAddressState_1'] = 'default_data'
        data['input_shippingAddressZip'] = 'default_data'
        data['input_shippingAddressZip_1'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

