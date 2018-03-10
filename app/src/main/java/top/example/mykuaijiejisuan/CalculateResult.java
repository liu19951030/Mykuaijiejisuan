package top.example.mykuaijiejisuan;

/**
 * Created by root on 2018/3/10.
 */

public class CalculateResult {
    /**
     * 总长容纳数量
     */
    private Double totalLengthIntakeCapacity;
    /**
     * 总宽容纳数量
     */
    private Double totalWidthIntakeCapacity;
    /**
     * 总长剩余量
     */
    private Double totalLengthSurplus;
    /**
     * 总宽剩余量
     */
    private Double totalWidthSurplus;

    public CalculateResult() {
    }

    public CalculateResult(Double totalLengthIntakeCapacity, Double totalWidthIntakeCapacity, Double totalLengthSurplus, Double totalWidthSurplus, Double sumPrice, int subblockNumber) {
        this.totalLengthIntakeCapacity = totalLengthIntakeCapacity;
        this.totalWidthIntakeCapacity = totalWidthIntakeCapacity;
        this.totalLengthSurplus = totalLengthSurplus;
        this.totalWidthSurplus = totalWidthSurplus;
        this.sumPrice = sumPrice;
        this.subblockNumber = subblockNumber;
    }

    /**
     * 总金额
     */

    private Double sumPrice;
    /**
     * 子块数量
     */
    private int subblockNumber;


    /**
     * 总长容纳数量
     */
    public Double getTotalLengthIntakeCapacity() {
        return totalLengthIntakeCapacity;
    }

    /**
     * 总长容纳数量
     */
    public void setTotalLengthIntakeCapacity(Double totalLengthIntakeCapacity) {
        this.totalLengthIntakeCapacity = totalLengthIntakeCapacity;
    }

    /**
     * 总宽容纳数量
     */
    public Double getTotalWidthIntakeCapacity() {
        return totalWidthIntakeCapacity;
    }

    /**
     * 总宽容纳数量
     */
    public void setTotalWidthIntakeCapacity(Double totalWidthIntakeCapacity) {
        this.totalWidthIntakeCapacity = totalWidthIntakeCapacity;
    }

    /**
     * 总长剩余量
     */
    public Double getTotalLengthSurplus() {
        return totalLengthSurplus;
    }

    /**
     * 总长剩余量
     */
    public void setTotalLengthSurplus(Double totalLengthSurplus) {
        this.totalLengthSurplus = totalLengthSurplus;
    }

    /**
     * 总宽剩余量
     */
    public Double getTotalWidthSurplus() {
        return totalWidthSurplus;
    }

    /**
     * 总宽剩余量
     */
    public void setTotalWidthSurplus(Double totalWidthSurplus) {
        this.totalWidthSurplus = totalWidthSurplus;
    }

    /**
     * 总金额
     */
    public Double getSumPrice() {
        return sumPrice;
    }

    /**
     * 总金额
     */
    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    /**
     * 子块数量
     */
    public int getSubblockNumber() {
        return subblockNumber;
    }

    /**
     * 子块数量
     */
    public void setSubblockNumber(int subblockNumber) {
        this.subblockNumber = subblockNumber;
    }
}
