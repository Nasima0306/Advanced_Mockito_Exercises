package Exercise4;

import com.telusko.Exercise4.NetworkClient;
import com.telusko.Exercise4.NetworkService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NetworkServiceTest {
    @Test
    public void testServiceWithMockNetworkClient() {

        NetworkClient mockNetworkClient =
                mock(NetworkClient.class);

        when(mockNetworkClient.connect())

                .thenReturn("Mock Connection");

        NetworkService networkService =
                new NetworkService(mockNetworkClient);

        String result =
                networkService.connectToServer();

        assertEquals(
                "Connected to Mock Connection",
                result
        );
    }
}
