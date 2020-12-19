Vue.component('messages-list', {
    props: ['messages'],
    template: '<div><div v-for = "message in messages">{{ message.text }}</div></div>'
});

var app = new Vue({
    el: '#app',
    template: '<message-list :messages="messages" />',
    data: {
        message: [
            {id: '1', text: 'text1'},
            {id: '2', text: 'text2'},
            {id: '3', text: 'text3'}

        ]
    }
});