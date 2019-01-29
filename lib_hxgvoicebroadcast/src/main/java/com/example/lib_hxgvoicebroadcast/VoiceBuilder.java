package com.example.lib_hxgvoicebroadcast;


import com.example.lib_hxgvoicebroadcast.util.StringUtils;

/**
 * 组合音频 实体类
 * 开头 + 金额 + 单位
 */

class VoiceBuilder {

    //开头音频
    private String start;
    //播报金额
    private String money;
    //单位
    private String unit;
    private String end;
    //是否转成全数字。 默认人民币
    private boolean checkNum;

    public String getStart() {
        return start;
    }

    public String getMoney() {
        return money;
    }

    public String getUnit() {
        return unit;
    }

    public String getEnd() {
        return end;
    }

    public boolean isCheckNum() {
        return checkNum;
    }

    public static class Builder {
        private String start;
        private String money;
        private String unit;
        private String end;
        private boolean checkNum;

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder money(String money) {
            this.money = StringUtils.getMoney(money);
            return this;
        }

        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public Builder checkNum(boolean checkNum) {
            this.checkNum = checkNum;
            return this;
        }

        public VoiceBuilder builder() {
            return new VoiceBuilder(this);
        }
    }

    public VoiceBuilder(Builder builder) {
        this.start = builder.start;
        this.money = builder.money;
        this.unit = builder.unit;
        this.end = builder.end;
        this.checkNum = builder.checkNum;
    }
}
