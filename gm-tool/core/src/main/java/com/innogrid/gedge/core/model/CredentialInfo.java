package com.innogrid.gedge.core.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.innogrid.gedge.core.util.JsonDateDeserializer;
import com.innogrid.gedge.core.util.JsonDateSerializer;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author kkm
 * @date 2019.3.18
 * @brief 클라우드별 API 접속 정보를 담는 클래스
 */
@Data
public class CredentialInfo implements Serializable {


    private static final long serialVersionUID = -4468599970527324982L;
    private String id;
    private String name;
    private String type;
    private String region;
    private String domain;
    private String url;
    private String tenant;
    private String accessId;
    private String accessToken;
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Timestamp createdAt;
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Timestamp duration;
    private String projectId;
    private String subscriptionId;
    private String cloudType;

    private List<ProjectInfo> projects;
}
