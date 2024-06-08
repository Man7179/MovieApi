import axios from 'axios';

export default axios.create({
    baseURL:'https://a49b-103-172-226-189.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});