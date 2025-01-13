package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.Notice;
import vass.com.repository.NoticeRepository;
import vass.com.service.contract.NoticeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {

    private final NoticeRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Notice> findAllActiveNotices() {
        return repository.findAllActiveNotices();
    }
}
