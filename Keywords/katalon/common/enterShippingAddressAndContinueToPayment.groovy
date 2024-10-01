package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterShippingAddressAndContinueToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input shippingAddressFirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'))
        
        "Step 2: Enter input value in input shippingAddressFirstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressFirstName'), data['input_shippingAddressFirstName'])
        
        "Step 3: Click on input shippingAddressLastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'))
        
        "Step 4: Enter input value in input shippingAddressLastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressLastName'), data['input_shippingAddressLastName'])
        
        "Step 5: Click on input shippingAddressAddressLine1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'))
        
        "Step 6: Enter input value in input shippingAddressAddressLine1"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressAddressLine1'), data['input_shippingAddressAddressLine1'])
        
        "Step 7: Click on input shippingAddressZip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'))
        
        "Step 8: Enter input value in input shippingAddressZip"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressZip'), data['input_shippingAddressZip'])
        
        "Step 9: Click on input shippingAddressCity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'))
        
        "Step 10: Enter input value in input shippingAddressCity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressCity'), data['input_shippingAddressCity'])
        
        "Step 11: Click on input shippingAddressState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'))
        
        "Step 12: Enter input value in input shippingAddressState"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressState'), data['input_shippingAddressState'])
        
        "Step 13: Click on input shippingAddressPhone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'))
        
        "Step 14: Enter input value in input shippingAddressPhone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_shippingAddressPhone'), data['input_shippingAddressPhone'])
        
        "Step 15: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_shippingAddressAddressLine1'] = testData.getValue('input_shippingAddressAddressLine1', rowIndex)
        data['input_shippingAddressCity'] = testData.getValue('input_shippingAddressCity', rowIndex)
        data['input_shippingAddressFirstName'] = testData.getValue('input_shippingAddressFirstName', rowIndex)
        data['input_shippingAddressLastName'] = testData.getValue('input_shippingAddressLastName', rowIndex)
        data['input_shippingAddressPhone'] = testData.getValue('input_shippingAddressPhone', rowIndex)
        data['input_shippingAddressState'] = testData.getValue('input_shippingAddressState', rowIndex)
        data['input_shippingAddressZip'] = testData.getValue('input_shippingAddressZip', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_shippingAddressAddressLine1'] = 'default_data'
        data['input_shippingAddressCity'] = 'default_data'
        data['input_shippingAddressFirstName'] = 'default_data'
        data['input_shippingAddressLastName'] = 'default_data'
        data['input_shippingAddressPhone'] = 'default_data'
        data['input_shippingAddressState'] = 'default_data'
        data['input_shippingAddressZip'] = 'default_data'
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

