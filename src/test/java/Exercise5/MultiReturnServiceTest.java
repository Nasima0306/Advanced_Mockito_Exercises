package Exercise5;

import com.telusko.Exercise1.Repository;
import com.telusko.Exercise1.Service;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {

        Repository mockRepository =
                mock(Repository.class);

        when(mockRepository.getData())

                .thenReturn("First Mock Data")

                .thenReturn("Second Mock Data");

        Service service =
                new Service(mockRepository);

        String firstResult =
                service.processData();

        String secondResult =
                service.processData();

        assertEquals(
                "Processed First Mock Data",
                firstResult
        );

        assertEquals(
                "Processed Second Mock Data",
                secondResult
        );
    }
}
