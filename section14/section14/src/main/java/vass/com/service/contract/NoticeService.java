package vass.com.service.contract;

import vass.com.model.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> findAllActiveNotices();
}
