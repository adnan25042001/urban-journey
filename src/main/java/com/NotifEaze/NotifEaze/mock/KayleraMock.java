package com.NotifEaze.NotifEaze.mock;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class KayleraMock {
    private static final Map<String, String> SMS_MOCKED_RESPONSES = new HashMap<>();
    private static final Map<String, String> EMAIL_MOCKED_RESPONSES = new HashMap<>();

	static {


        /*
        <?xml version="1.0" encoding="UTF-8" ?>
            <root>
                <status>00</status>
                <messageId>123456</messageId>
                <responseMessage>Success</responseMessage>
            </root>
        */
        SMS_MOCKED_RESPONSES.put("123456", "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "            <root>\n" +
                "                <status>00</status>\n" +
                "                <messageId>123456</messageId>\n" +
                "                <responseMessage>Success</responseMessage>\n" +
                "            </root>");

        
        /*
        <?xml version="1.0" encoding="UTF-8" ?>
            <root>
                <status>1</status>
                <messageId>789012</messageId>
                <responseMessage>Failed</responseMessage>
            </root>
         */
        SMS_MOCKED_RESPONSES.put("789012", "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "            <root>\n" +
                "                <status>1</status>\n" +
                "                <messageId>789012</messageId>\n" +
                "                <responseMessage>Failed</responseMessage>\n" +
                "            </root>");
        
        
        /*
        <?xml version="1.0" encoding="UTF-8" ?>
            <root>
                <status>00</status>
                <message>Email sent successfully</message>
                <timestamp>2023-12-01T14:30:00Z</timestamp>
                <data>
                	<email_id>test1@gmail.com</email_id>
                	<recipient>user@gmail.com</recipient>
                	<subject>user@gmail.com</subject>
                </data>
            </root>
        */
        EMAIL_MOCKED_RESPONSES.put("test1", "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "            <root>\n" +
                "                <status>00</status>\n" +
                "                <message>Email sent successfully</message>\n" +
                "                <timestamp>2023-12-01T14:30:00Z</timestamp>\n" +
                "            	 <data>\n" +
                "                	 <email_id>test1@gmail.com</email_id>\n" +
                "                	 <recipient>user@gmail.com</recipient>\n" +
                "                	 <subject>user@gmail.com</subject>\n" +
                "            </root>");

    }
	
	
	public String getMockedSmsResponse(String messageId) {
        return SMS_MOCKED_RESPONSES.get(messageId);
    }

    public String getMockedEmailResponse(String messageId) {
        return EMAIL_MOCKED_RESPONSES.get(messageId);
    }
	
}
