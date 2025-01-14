package com.yas.webhook.model.viewmodel.webhook;

import com.yas.webhook.model.enumeration.EventName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventVm {
    long id;
    EventName name;
}
