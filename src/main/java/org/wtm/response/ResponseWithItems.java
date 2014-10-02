package org.wtm.response;

import java.util.List;

/**
 * Created by dovbysh on 08.08.14.
 */
public class ResponseWithItems<T> {

   private Response<T> response;

    public Response<T> getResponse() {
        return response;
    }

    public void setResponse(Response<T> response) {
        this.response = response;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseWithItems{");
        sb.append("response=").append(response);
        sb.append('}');
        return sb.toString();
    }

    public class Response<T> {
        private Integer count;
        private List<T> items;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<T> getItems() {
            return items;
        }

        public void setItems(List<T> response) {
            this.items = response;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("ResponsWithItems{");
            sb.append("count=").append(count);
            sb.append(", items=").append(items);
            sb.append('}');
            return sb.toString();
        }
    }

}
