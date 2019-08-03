<template>
  <div class="home">
    <h1 class="home-title">Login</h1>
    <section class="home-section">
      <Input type="text" v-model="email" :value="email" placeholder="e-mail" />
      <Input type="password" v-model="password" :value="password" placeholder="password" />
    </section>
  </div>
</template>

<script>
import Input from "@/components/Input.vue";

export default {
  name: "home",
  components: {
    Input
  },
  data() {
    return {
      email: "",
      password: ""
    };
  }
};
</script>

<style lang="scss" scoped>
.home {
  height: 100%;
  display: flex;
  align-items: center;
  flex-direction: column;

  &-title {
    margin: 200px 0 20px;
  }

  &-section {
    width: 350px;
    display: flex;
    flex-direction: column;

    & > input {
      &:not(:last-child) {
        margin-bottom: 20px;
      }
    }
  }
}
</style>

