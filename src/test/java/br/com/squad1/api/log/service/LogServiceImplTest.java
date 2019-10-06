package br.com.squad1.api.log.service;

import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.log.repository.LogRepository;
import br.com.squad1.api.usuario.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class LogServiceImplTest {
    @Mock
    private LogRepository logRepository;

    @InjectMocks
    private LogServiceImpl logServiceImpl;

    @Test
    public void testFindLogById() {
        mockFindLogById();
        assertEquals(new Long(1), logServiceImpl.findOneById(new Long(1)).getId());
    }

    private void mockFindLogById() {
        Log log = mock(Log.class);
        when(log.getId()).thenReturn(new Long (1));
        when(this.logRepository.findOneById(new Long(1))).thenReturn(log);
    }
}
