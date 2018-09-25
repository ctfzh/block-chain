package com.xdaocloud.futurechain.dto.req.contract;

import com.xdaocloud.futurechain.common.IBaseRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/26.
 */
public class ContractManageNewsRequest implements IBaseRequest,Serializable {

    private static final long serialVersionUID = 8168689167161794756L;

    @NotNull(message = "合约id不能为空")
    private long contractId;

    @NotBlank(message = "用户ID不能为空")
    private String userId;

    @NotNull(message = "类型不能为空")
    private int type ; // 1 我的发布   2  我的签约

    @Min(value = 1)
    private int page;           //页数(默认是1)

    @Min(value = 1)
    private int  size;           //每页显示数量

    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
