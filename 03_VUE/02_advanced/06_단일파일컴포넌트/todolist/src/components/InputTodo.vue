<template>
  <input
    type="text"
    v-model.trim="todo"
    @keyup.enter="addTodo"
    @keyup.ctrl.enter="addTodo"
  />
  <button @click="addTodo">추가</button>
</template>

<script setup>
import { ref } from 'vue';
const todo = ref('');
const emit = defineEmits(['add']);

const addTodo = (e) => {
  // 빈 문자열 예외처리
  if (todo.value === '') return;

  // 배열에 추가
  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,
    completed: e.ctrlKey ? true : false,
  });

  // todo 초기화
  todo.value = '';
};
</script>

<style lang="scss" scoped></style>
