package Exercise2;

import com.telusko.Exercise2.ApiService;
import com.telusko.Exercise2.RestClient;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApiServiceTest {
    @Test
    public void testServiceWithMockRestClient() {

        RestClient mockRestClient =
                mock(RestClient.class);

        when(mockRestClient.getResponse())

                .thenReturn("Mock Response");

        ApiService apiService =
                new ApiService(mockRestClient);

        String result =
                apiService.fetchData();

        assertEquals(
                "Fetched Mock Response",
                result
        );
    }
}
