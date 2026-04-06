<template>
  <div>
    <h2>TodoList 테스트(Composition API)</h2>
    <hr />
    <!-- 할 일 추가 -->
    할 일 추가:
    <input type="text" v-model="todo" />
    <button @click="addTodoHandler">추가</button>
    <hr />
    <!-- todoItem -->
    <ul>
      <li v-for="todoItem in todoList" :key="todoItem.id">
        <span
          @click="toggleTodo(todoItem.id)"
          :style="{ textDecoration: todoItem.done ? 'line-through' : 'none' }"
          >{{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}</span
        >
        <button @click="deleteTodo(todoItem.id)">삭제</button>
      </li>
    </ul>

    <!-- 완료된 할 일 수 -->
    <div>완료된 할일 수 : {{ todoListStore.doneCount }}</div>
  </div>
</template>

<script setup>
import { useTodoListStore } from './stores/todo';
import { ref } from 'vue';

const todo = ref('');

// state
const todoListStore = useTodoListStore();
const todoList = todoListStore.todoList;

const addTodoHandler = () => {
  addTodo(todo.value);
  todo.value = ''; // 초기화
};

// actions
const { addTodo, deleteTodo, toggleTodo } = useTodoListStore();
</script>

<style lang="scss" scoped></style>
