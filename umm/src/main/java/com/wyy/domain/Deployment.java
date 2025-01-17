package com.wyy.domain;

import io.swagger.annotations.ApiModel;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * 模型部署实例（能力）
 */
@ApiModel(description = "模型部署实例（能力）")
@Entity
@Table(name = "deployment")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Deployment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "deployer")
    private String deployer;

    @Column(name = "solution_uuid")
    private String solutionUuid;

    @Column(name = "solution_name")
    private String solutionName;

    @Column(name = "solution_author")
    private String solutionAuthor;

    @Column(name = "k_8_s_port")
    private Integer k8sPort;

    @Column(name = "is_public")
    private Boolean isPublic;

    @Column(name = "status")
    private String status;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Size(max = 512)
    @Column(name = "picture_url", length = 512)
    private String pictureUrl;

    @Column(name = "model_type")
    private String modelType;

    @Column(name = "toolkit_type")
    private String toolkitType;

    @Column(name = "call_count")
    private Long callCount;

    @Size(max = 512)
    @Column(name = "demo_url", length = 512)
    private String demoUrl;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public Deployment uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeployer() {
        return deployer;
    }

    public Deployment deployer(String deployer) {
        this.deployer = deployer;
        return this;
    }

    public void setDeployer(String deployer) {
        this.deployer = deployer;
    }

    public String getSolutionUuid() {
        return solutionUuid;
    }

    public Deployment solutionUuid(String solutionUuid) {
        this.solutionUuid = solutionUuid;
        return this;
    }

    public void setSolutionUuid(String solutionUuid) {
        this.solutionUuid = solutionUuid;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public Deployment solutionName(String solutionName) {
        this.solutionName = solutionName;
        return this;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getSolutionAuthor() {
        return solutionAuthor;
    }

    public Deployment solutionAuthor(String solutionAuthor) {
        this.solutionAuthor = solutionAuthor;
        return this;
    }

    public void setSolutionAuthor(String solutionAuthor) {
        this.solutionAuthor = solutionAuthor;
    }

    public Integer getk8sPort() {
        return k8sPort;
    }

    public Deployment k8sPort(Integer k8sPort) {
        this.k8sPort = k8sPort;
        return this;
    }

    public void setk8sPort(Integer k8sPort) {
        this.k8sPort = k8sPort;
    }

    public Boolean isIsPublic() {
        return isPublic;
    }

    public Deployment isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getStatus() {
        return status;
    }

    public Deployment status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public Deployment createdDate(Instant createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public Deployment modifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public Deployment pictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getModelType() {
        return modelType;
    }

    public Deployment modelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getToolkitType() {
        return toolkitType;
    }

    public Deployment toolkitType(String toolkitType) {
        this.toolkitType = toolkitType;
        return this;
    }

    public void setToolkitType(String toolkitType) {
        this.toolkitType = toolkitType;
    }

    public Long getCallCount() {
        return callCount;
    }

    public Deployment callCount(Long callCount) {
        this.callCount = callCount;
        return this;
    }

    public void setCallCount(Long callCount) {
        this.callCount = callCount;
    }

    public String getDemoUrl() {
        return demoUrl;
    }

    public Deployment demoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
        return this;
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Deployment deployment = (Deployment) o;
        if (deployment.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deployment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Deployment{" +
            "id=" + getId() +
            ", uuid='" + getUuid() + "'" +
            ", deployer='" + getDeployer() + "'" +
            ", solutionUuid='" + getSolutionUuid() + "'" +
            ", solutionName='" + getSolutionName() + "'" +
            ", solutionAuthor='" + getSolutionAuthor() + "'" +
            ", k8sPort=" + getk8sPort() +
            ", isPublic='" + isIsPublic() + "'" +
            ", status='" + getStatus() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", modifiedDate='" + getModifiedDate() + "'" +
            ", pictureUrl='" + getPictureUrl() + "'" +
            ", modelType='" + getModelType() + "'" +
            ", toolkitType='" + getToolkitType() + "'" +
            ", callCount=" + getCallCount() +
            ", demoUrl='" + getDemoUrl() + "'" +
            "}";
    }
}
