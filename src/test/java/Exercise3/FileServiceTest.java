package Exercise3;

import com.telusko.Exercise3.FileService;
import com.telusko.Exercise3.MyFileReader;
import com.telusko.Exercise3.MyFileWriter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileServiceTest {
    @Test
    public void testServiceWithMockFileIO() {

        MyFileReader mockReader =
                mock(MyFileReader.class);

        MyFileWriter mockWriter =
                mock(MyFileWriter.class);

        when(mockReader.read())

                .thenReturn(
                        "Mock File Content"
                );

        FileService fileService =
                new FileService(
                        mockReader,
                        mockWriter
                );

        String result =
                fileService.processFile();

        assertEquals(
                "Processed Mock File Content",
                result
        );
    }
}
