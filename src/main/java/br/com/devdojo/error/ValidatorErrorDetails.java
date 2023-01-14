package br.com.devdojo.error;

public class ValidatorErrorDetails extends ErrorDetail {
    private String field;
    private String fieldMessage;
    public static final class Builder {
        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;
        private String field;
        private String fieldMessage;
        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }
        public Builder field(String field) {
            this.field = field;
            return this;
        }
        public Builder fieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public ValidatorErrorDetails build() {
            ValidatorErrorDetails validatorErrorDetails = new ValidatorErrorDetails();
            validatorErrorDetails.setDeveloperMessage(developerMessage);
            validatorErrorDetails.setTitle(title);
            validatorErrorDetails.setDetail(detail);
            validatorErrorDetails.setTimestamp(timestamp);
            validatorErrorDetails.setStatus(status);
            return validatorErrorDetails;
        }
    }

    public String getField() {
        return field;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }
}
