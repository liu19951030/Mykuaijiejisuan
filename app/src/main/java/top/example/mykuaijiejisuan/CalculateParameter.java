package top.example.mykuaijiejisuan;

/**
 *
 * Created by root on 2018/3/10.
 */

public class CalculateParameter {
    /**
     * 总长度
     */
    private Double totalLength;
    /**
     * 总宽度
     */
    private Double totalWidth;
    /**
     * 左右间距
     */
    private Double leftRightInterval;
    /**
     * 上下间距
     */
    private Double topBottomInterval;
    /**
     * 子块长度
     */
    private Double sonLength;
    /**
     * 子块宽度
     */
    private Double sonWidth;
    /**
     * 子块宽间距
     */
    private Double sonWidthInterval;
    /**
     * 子块长间距
     */
    private Double sonLengthInterval;
    /**
     * 单价
     */
    private Double unitPrice;
    /**
     * 子块数量
     */
    private int subblockNumber;


    public CalculateParameter(Double totalLength, Double totalWidth, Double leftRightInterval, Double topBottomInterval, Double sonLength, Double sonWidth, Double sonWidthInterval, Double sonLengthInterval, Double unitPrice, int subblockNumber) {
        this.totalLength = totalLength;
        this.totalWidth = totalWidth;
        this.leftRightInterval = leftRightInterval;
        this.topBottomInterval = topBottomInterval;
        this.sonLength = sonLength;
        this.sonWidth = sonWidth;
        this.sonWidthInterval = sonWidthInterval;
        this.sonLengthInterval = sonLengthInterval;
        this.unitPrice = unitPrice;
        this.subblockNumber = subblockNumber;
    }

    public CalculateParameter() {
    }

    /**
     * 总长度
     */
    public Double getTotalLength() {
        return totalLength;
    }

    /**
     * 总长度
     */
    public void setTotalLength(Double totalLength) {
        this.totalLength = totalLength;
    }

    /**
     * 总宽度
     */
    public Double getTotalWidth() {
        return totalWidth;
    }

    /**
     * 总宽度
     */
    public void setTotalWidth(Double totalWidth) {
        this.totalWidth = totalWidth;
    }

    /**
     * 左右间距
     */
    public Double getLeftRightInterval() {
        return leftRightInterval;
    }

    /**
     * 左右间距
     */
    public void setLeftRightInterval(Double leftRightInterval) {
        this.leftRightInterval = leftRightInterval;
    }

    /**
     * 上下间距
     */
    public Double getTopBottomInterval() {
        return topBottomInterval;
    }

    /**
     * 上下间距
     */
    public void setTopBottomInterval(Double topBottomInterval) {
        this.topBottomInterval = topBottomInterval;
    }

    /**
     * 子块长度
     */
    public Double getSonLength() {
        return sonLength;
    }

    /**
     * 子块长度
     */
    public void setSonLength(Double sonLength) {
        this.sonLength = sonLength;
    }

    /**
     * 子块宽度
     */
    public Double getSonWidth() {
        return sonWidth;
    }

    /**
     * 子块宽度
     */
    public void setSonWidth(Double sonWidth) {
        this.sonWidth = sonWidth;
    }

    /**
     * 子块宽间距
     */
    public Double getSonWidthInterval() {
        return sonWidthInterval;
    }

    /**
     * 子块宽间距
     */
    public void setSonWidthInterval(Double sonWidthInterval) {
        this.sonWidthInterval = sonWidthInterval;
    }

    /**
     * 子块长间距
     */
    public Double getSonLengthInterval() {
        return sonLengthInterval;
    }

    /**
     * 子块长间距
     */
    public void setSonLengthInterval(Double sonLengthInterval) {
        this.sonLengthInterval = sonLengthInterval;
    }

    /**
     * 单价
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 单价
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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
